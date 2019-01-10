package by.pvt.dao.impl;

import by.pvt.dao.POSTREQOrderItemDao;
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
public class POSTREQOrderItemDaoImplTest {

    @Autowired
    POSTREQOrderItemDao pOSTREQOrderItemDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        POSTREQOrderItem pOSTREQOrderItem = new POSTREQOrderItem();
        pOSTREQOrderItem.setAction(ActionType.ADD);
        pOSTREQOrderItem.setQuantity(1234L);
        pOSTREQOrderItem.setType("TestType");
        pOSTREQOrderItem.setSchemaLocation("TestSchemaLocation");
        AppointmentRef appointmentRef = new AppointmentRef();
        appointmentRef.setHref("Href1");
        pOSTREQOrderItem.setAppointment(appointmentRef);
        BillingAccountRef billingAccountRef = new BillingAccountRef();
        billingAccountRef.setHref("TestHref");
        pOSTREQOrderItem.setBillingAccount(billingAccountRef);
        pOSTREQOrderItem.setItemPrice(List.of());
        ProductOffering productOffering = new ProductOffering();
        pOSTREQOrderItem.setProductOffering(productOffering);
        Product product = new Product();
        pOSTREQOrderItem.setProduct(product);
        pOSTREQOrderItem.setOrderItemRelationship(List.of());
        pOSTREQOrderItem.setQualification(List.of());
        pOSTREQOrderItem.setPayment(List.of());
        pOSTREQOrderItem.setItemTerm(List.of());
        pOSTREQOrderItem.setOrderItem(List.of());

        //create
        pOSTREQOrderItemDao.create(pOSTREQOrderItem);
        String id = pOSTREQOrderItem.getId();
        assertNotNull(id);

        //read
        POSTREQOrderItem pOSTREQOrderItemRead = pOSTREQOrderItemDao.read(id);
        assertEquals("TestType", pOSTREQOrderItemRead.getType());

        //update
        pOSTREQOrderItemRead.setType("New TestType");
        pOSTREQOrderItemDao.update(pOSTREQOrderItemRead);
        POSTREQOrderItem pOSTREQOrderItemUpdate = pOSTREQOrderItemDao.read(id);
        assertEquals("New TestType", pOSTREQOrderItemUpdate.getType());

        //delete
        pOSTREQOrderItemDao.delete(id);
        POSTREQOrderItem pOSTREQOrderItemDelete = pOSTREQOrderItemDao.read(id);
        assertNull(pOSTREQOrderItemDelete);
    }

    @Test
    public void getAll() {
        POSTREQOrderItem pOSTREQOrderItem1 = new POSTREQOrderItem();
        pOSTREQOrderItem1.setAction(ActionType.ADD);
        POSTREQOrderItem pOSTREQOrderItem2 = new POSTREQOrderItem();
        pOSTREQOrderItem2.setAction(ActionType.MODIFY);
        pOSTREQOrderItemDao.create(pOSTREQOrderItem1);
        pOSTREQOrderItemDao.create(pOSTREQOrderItem2);
        String id1 = pOSTREQOrderItem1.getId();
        String id2 = pOSTREQOrderItem2.getId();

        List<POSTREQOrderItem> pOSTREQOrderItemList = pOSTREQOrderItemDao.getAll();
        assertEquals(2, pOSTREQOrderItemList.size());

        pOSTREQOrderItemDao.delete(id1);
        pOSTREQOrderItemDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}