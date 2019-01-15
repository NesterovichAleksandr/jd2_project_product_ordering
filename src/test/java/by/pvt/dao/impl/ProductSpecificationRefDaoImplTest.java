package by.pvt.dao.impl;

import by.pvt.dao.ProductSpecificationRefDao;
import by.pvt.model.ProductSpecificationRef;
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
public class ProductSpecificationRefDaoImplTest {


    @Autowired
    ProductSpecificationRefDao productSpecificationRefDao;

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
        ProductSpecificationRef productSpecificationRef = new ProductSpecificationRef();
        productSpecificationRef.setHref("TestHref");
        productSpecificationRef.setVersion("Version");
        productSpecificationRef.setName("TestName");
        productSpecificationRef.setType("TestType");

        //create
        productSpecificationRefDao.create(productSpecificationRef);
        String id = productSpecificationRef.getId();
        assertNotNull(id);

        //read
        ProductSpecificationRef productSpecificationRefRead = productSpecificationRefDao.read(id);
        assertEquals("TestHref", productSpecificationRefRead.getHref());

        //update
        productSpecificationRefRead.setType("New TestType");
        productSpecificationRefDao.update(productSpecificationRefRead);
        ProductSpecificationRef productSpecificationRefUpdate = productSpecificationRefDao.read(id);
        assertEquals("New TestType", productSpecificationRefUpdate.getType());

        //delete
        productSpecificationRefDao.delete(id);
        ProductSpecificationRef productSpecificationRefDelete = productSpecificationRefDao.read(id);
        assertNull(productSpecificationRefDelete);
    }

    @Test
    @Commit
    public void getAll() {
        ProductSpecificationRef productSpecificationRef1 = new ProductSpecificationRef();
        productSpecificationRef1.setHref("Href1");
        ProductSpecificationRef productSpecificationRef2 = new ProductSpecificationRef();
        productSpecificationRef2.setHref("Href2");
        productSpecificationRefDao.create(productSpecificationRef1);
        productSpecificationRefDao.create(productSpecificationRef2);
        String id1 = productSpecificationRef1.getId();
        String id2 = productSpecificationRef2.getId();

        List<ProductSpecificationRef> productSpecificationRefList = productSpecificationRefDao.getAll();
        assertEquals(2, productSpecificationRefList.size());

        productSpecificationRefDao.delete(id1);
        productSpecificationRefDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}