package by.pvt.dao.impl;

import by.pvt.dao.OrderItemDao;
import by.pvt.model.*;
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
public class OrderItemDaoImplTest {

    @Autowired
    OrderItemDao orderItemDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        OrderItem orderItem = new OrderItem();
        orderItem.setAction(ActionType.ADD);
        orderItem.setState(StateType.COMPLETED);
        orderItem.setQuantity(1234L);
        orderItem.setType("TestType");
        orderItem.setSchemaLocation("TestSchemaLocation");
        AppointmentRef appointmentRef = new AppointmentRef();
        appointmentRef.setHref("Href1");
        orderItem.setAppointment(appointmentRef);
        BillingAccountRef billingAccountRef = new BillingAccountRef();
        billingAccountRef.setHref("TestHref");
        orderItem.setBillingAccount(billingAccountRef);
        orderItem.setItemPrice(List.of());
        ProductOffering productOffering = new ProductOffering();
        orderItem.setProductOffering(productOffering);
        Product product = new Product();
        orderItem.setProduct(product);
        orderItem.setOrderItemRelationship(List.of());
        orderItem.setQualification(List.of());
        orderItem.setPayment(List.of());
        orderItem.setItemTerm(List.of());
        orderItem.setOrderItem(List.of());

        //create
        orderItemDao.create(orderItem);
        String id = orderItem.getId();
        assertNotNull(id);

        //read
        OrderItem orderItemRead = orderItemDao.read(id);
        assertEquals("TestType", orderItemRead.getType());

        //update
        orderItemRead.setType("New TestType");
        orderItemDao.update(orderItemRead);
        OrderItem orderItemUpdate = orderItemDao.read(id);
        assertEquals("New TestType", orderItemUpdate.getType());

        //delete
        orderItemDao.delete(id);
        OrderItem orderItemDelete = orderItemDao.read(id);
        assertNull(orderItemDelete);
    }

    @Test
    public void getAll() {
        OrderItem orderItem1 = new OrderItem();
        orderItem1.setAction(ActionType.ADD);
        OrderItem orderItem2 = new OrderItem();
        orderItem2.setAction(ActionType.MODIFY);
        orderItemDao.create(orderItem1);
        orderItemDao.create(orderItem2);
        String id1 = orderItem1.getId();
        String id2 = orderItem2.getId();

        List<OrderItem> orderItemList = orderItemDao.getAll();
        assertEquals(2, orderItemList.size());

        orderItemDao.delete(id1);
        orderItemDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}