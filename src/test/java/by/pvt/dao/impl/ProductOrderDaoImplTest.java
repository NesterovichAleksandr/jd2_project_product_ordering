package by.pvt.dao.impl;

import by.pvt.dao.ProductOrderDao;
import by.pvt.model.ProductOrder;
import by.pvt.service.ProductOrderService;
import by.pvt.service.impl.ProductOrderServiceImpl;
import io.swagger.configuration.HibernateXMLConfTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import static org.junit.Assert.*;

@Transactional
public class ProductOrderDaoImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    ProductOrderDao objUnderTest;

    @Before
    public void setUp() throws Exception {
    }

    @Ignore
    public void crud() {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setDescription("DescriptionTestCRUD");
        productOrder.setCategory("CategoryTestCRUD");
        productOrder.setHref("localhost/TestCRUD");

        //create
        objUnderTest.create(productOrder);
        String id = productOrder.getId();
        assertNotNull(id);

        //read
        ProductOrder productOrder1 = objUnderTest.read(id);
        assertEquals("DescriptionTestCRUD", productOrder1.getDescription());

        //update
        productOrder1.setDescription("New DescriptionTestCRUD");
        objUnderTest.update(productOrder1);
        ProductOrder productOrder2 = objUnderTest.read(id);
        assertEquals("New DescriptionTestCRUD", productOrder2.getDescription());

        //delete
        objUnderTest.delete(id);
        assertNull(objUnderTest.read(id));
    }

    @After
    public void tearDown() throws Exception {
    }
}