package by.pvt.dao.impl;

import by.pvt.dao.ProductRelationshipDao;
import by.pvt.model.Product;
import by.pvt.model.ProductRelationship;
import by.pvt.model.RelationShipType;
import io.swagger.configuration.HibernateXMLConfTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
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
public class ProductRelationshipDaoImplTest {

    @Autowired
    ProductRelationshipDao productRelationshipDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        ProductRelationship productRelationship = new ProductRelationship();
        productRelationship.setType(RelationShipType.BRINGS);
        productRelationship.setProduct(new Product());

        //create
        productRelationshipDao.create(productRelationship);
        Long id = productRelationship.getId();
        assertNotNull(id);

        //read
        ProductRelationship productRelationshipRead = productRelationshipDao.read(id);
        assertEquals(RelationShipType.BRINGS, productRelationshipRead.getType());

        //update
        productRelationshipRead.setType(RelationShipType.HASCHILD);
        productRelationshipDao.update(productRelationshipRead);
        ProductRelationship productRelationshipUpdate = productRelationshipDao.read(id);
        assertEquals(RelationShipType.HASCHILD, productRelationshipUpdate.getType());

        //delete
        productRelationshipDao.delete(id);
        ProductRelationship productRelationshipDelete = productRelationshipDao.read(id);
        assertNull(productRelationshipDelete);
    }

    @Test
    public void getAll() {
        ProductRelationship productRelationship1 = new ProductRelationship();
        productRelationship1.setType(RelationShipType.BRINGS);
        productRelationship1.setProduct(new Product());
        ProductRelationship productRelationship2 = new ProductRelationship();
        productRelationship2.setType(RelationShipType.BRINGS);
        productRelationship2.setProduct(new Product());
        productRelationshipDao.create(productRelationship1);
        productRelationshipDao.create(productRelationship2);
        Long id1 = productRelationship1.getId();
        Long id2 = productRelationship2.getId();

        List<ProductRelationship> productRelationshipList = productRelationshipDao.getAll();
        assertEquals(2, productRelationshipList.size());

        productRelationshipDao.delete(id1);
        productRelationshipDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}