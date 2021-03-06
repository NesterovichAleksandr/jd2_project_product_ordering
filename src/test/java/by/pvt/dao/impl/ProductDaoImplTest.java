package by.pvt.dao.impl;

import by.pvt.dao.ProductDao;
import by.pvt.model.*;
import io.swagger.configuration.HibernateXMLConfTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class ProductDaoImplTest {

    @Autowired
    ProductDao productDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    @Commit
    public void crud() {
        Product product = new Product();
        product.setHref("TestHref");
        product.setName("TestName");
        product.setPlace(List.of(
                new Place()
                        .role("role")
        ));
        product.setCharacteristic(List.of(
                new ProductCharacteristic()
                        .name("name")
                        .type("type")
                        .value("value")));
        product.setRelatedParty(List.of(
                new RelatedPartyRef()
                        .role("role")
                        .href("href")
        ));
        product.setProductRelationship(List.of(
                new ProductRelationship()
                        .type(RelationShipType.HASCHILD)
                        .product(new Product())
        ));
        product.setProductSpecification(new ProductSpecificationRef().href("href"));

        //create
        productDao.create(product);
        String id = product.getId();
        assertNotNull(id);

        //read
        Product productRead = productDao.read(id);
        assertEquals("TestHref", productRead.getHref());

        //update
        productRead.setHref("New TestHref");
        productDao.update(productRead);
        Product productUpdate = productDao.read(id);
        assertEquals("New TestHref", productUpdate.getHref());

        //delete
        productDao.delete(id);
        Product productDelete = productDao.read(id);
        assertNull(productDelete);
    }

    @Test
    @Commit
    public void getAll() {
        Product product1 = new Product();
        Product product2 = new Product();
        productDao.create(product1);
        productDao.create(product2);
        String id1 = product1.getId();
        String id2 = product2.getId();

        List<Product> productList = productDao.getAll();
        assertEquals(2, productList.size());

        productDao.delete(id1);
        productDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}