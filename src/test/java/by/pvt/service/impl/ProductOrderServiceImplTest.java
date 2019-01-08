package by.pvt.service.impl;

import by.pvt.model.ProductOrder;
import by.pvt.service.ProductOrderService;
import by.pvt.service.impl.ProductOrderServiceImpl;
import io.swagger.configuration.HibernateXMLConfTest;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class ProductOrderServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    ProductOrderService objUnderTest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void list() {
        // given
        ProductOrder productOrder = productOrder("1");
        objUnderTest.create(productOrder);

        // when
        Serializable id = productOrder.getId();
        assertNotNull(id);

        // then
        List<ProductOrder> productOrders = objUnderTest.getAll();
        assertEquals(1, productOrders.size());
        assertEquals(id, productOrders.get(0).getId());
    }

    @Test
    public void createReadUpdateDelete() {
        //create
        ProductOrder productOrder = new ProductOrder();
        productOrder.setDescription("TestDescription");
        objUnderTest.create(productOrder);
        String id = productOrder.getId();
        assertNotNull(id);

        //read
        ProductOrder productOrder1 = objUnderTest.read(id);
        assertEquals("TestDescription", productOrder1.getDescription());
/*
        //update
        productOrder1.setCategory("TestCategory");
        objUnderTest.update(productOrder1);
        ProductOrder productOrderTestUpdate = objUnderTest.read(id);
        assertEquals("TestCategory", productOrderTestUpdate.getCategory());
        */
        //delete
        objUnderTest.delete(id);
        //assertNull(objUnderTest.read(id));
    }

    @After
    public void tearDown() throws Exception {
    }

    public static ProductOrder productOrder(String prefix) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setDescription("Description" + prefix);
        productOrder.setCategory("Category" + prefix);
        productOrder.setHref("localhost/" + prefix);
        return productOrder;
    }
}