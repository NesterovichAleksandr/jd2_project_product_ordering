package by.pvt.dao.impl;

import by.pvt.model.ProductOrder;
import by.pvt.service.impl.ProductOrderServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.*;

public class ProductOrderDaoImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    ProductOrderServiceImpl<ProductOrder> objUnderTest;

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