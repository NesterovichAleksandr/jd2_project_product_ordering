package by.pvt.dao.impl;

import by.pvt.dao.ProductOfferingDao;
import by.pvt.model.ProductOffering;
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
public class ProductOfferingDaoImplTest {

    @Autowired
    ProductOfferingDao productOfferingDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        ProductOffering productOffering = new ProductOffering();
        productOffering.setHref("TestHref");
        productOffering.setName("TestName");
        productOffering.setType("TestType");

        //create
        productOfferingDao.create(productOffering);
        String id = productOffering.getId();
        assertNotNull(id);

        //read
        ProductOffering productOfferingRead = productOfferingDao.read(id);
        assertEquals("TestHref", productOfferingRead.getHref());

        //update
        productOfferingRead.setType("New TestType");
        productOfferingDao.update(productOfferingRead);
        ProductOffering productOfferingUpdate = productOfferingDao.read(id);
        assertEquals("New TestType", productOfferingUpdate.getType());

        //delete
        productOfferingDao.delete(id);
        ProductOffering productOfferingDelete = productOfferingDao.read(id);
        assertNull(productOfferingDelete);
    }

    @Test
    public void getAll() {
        ProductOffering productOffering1 = new ProductOffering();
        productOffering1.setHref("Href1");
        ProductOffering productOffering2 = new ProductOffering();
        productOffering2.setHref("Href2");
        productOfferingDao.create(productOffering1);
        productOfferingDao.create(productOffering2);
        String id1 = productOffering1.getId();
        String id2 = productOffering2.getId();

        List<ProductOffering> productOfferingList = productOfferingDao.getAll();
        assertEquals(2, productOfferingList.size());

        productOfferingDao.delete(id1);
        productOfferingDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}