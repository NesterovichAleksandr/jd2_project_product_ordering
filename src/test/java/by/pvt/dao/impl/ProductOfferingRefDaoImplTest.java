package by.pvt.dao.impl;

import by.pvt.dao.ProductOfferingRefDao;
import by.pvt.model.ProductOfferingRef;
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
public class ProductOfferingRefDaoImplTest {

    @Autowired
    ProductOfferingRefDao productOfferingRefDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        ProductOfferingRef productOfferingRef = new ProductOfferingRef();
        productOfferingRef.setHref("TestHref");
        productOfferingRef.setName("TestName");
        productOfferingRef.setType("TestType");

        //create
        productOfferingRefDao.create(productOfferingRef);
        String id = productOfferingRef.getId();
        assertNotNull(id);

        //read
        ProductOfferingRef productOfferingRefRead = productOfferingRefDao.read(id);
        assertEquals("TestHref", productOfferingRefRead.getHref());

        //update
        productOfferingRefRead.setType("New TestType");
        productOfferingRefDao.update(productOfferingRefRead);
        ProductOfferingRef productOfferingRefUpdate = productOfferingRefDao.read(id);
        assertEquals("New TestType", productOfferingRefUpdate.getType());

        //delete
        productOfferingRefDao.delete(id);
        ProductOfferingRef productOfferingRefDelete = productOfferingRefDao.read(id);
        assertNull(productOfferingRefDelete);
    }

    @Test
    public void getAll() {
        ProductOfferingRef productOfferingRef1 = new ProductOfferingRef();
        ProductOfferingRef productOfferingRef2 = new ProductOfferingRef();
        productOfferingRefDao.create(productOfferingRef1);
        productOfferingRefDao.create(productOfferingRef2);
        String id1 = productOfferingRef1.getId();
        String id2 = productOfferingRef2.getId();

        List<ProductOfferingRef> productOfferingRefList = productOfferingRefDao.getAll();
        assertEquals(2, productOfferingRefList.size());

        productOfferingRefDao.delete(id1);
        productOfferingRefDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}