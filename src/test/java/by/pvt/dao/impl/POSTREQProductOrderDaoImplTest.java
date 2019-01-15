package by.pvt.dao.impl;

import by.pvt.dao.POSTREQProductOrderDao;
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
import org.threeten.bp.OffsetDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class POSTREQProductOrderDaoImplTest {

    @Autowired
    POSTREQProductOrderDao pOSTREQProductOrderDao;

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
        POSTREQProductOrder pOSTREQProductOrder = new POSTREQProductOrder();
        pOSTREQProductOrder.setExternalId("ExternalId");
        pOSTREQProductOrder.setPriority(PriorityType._3);
        pOSTREQProductOrder.setDescription("Description");
        pOSTREQProductOrder.setCategory("Category");
        pOSTREQProductOrder.setRequestedStartDate(OffsetDateTime.now());
        pOSTREQProductOrder.setRequestedCompletionDate(OffsetDateTime.now().plusDays(1));
        pOSTREQProductOrder.setNotificationContact("NotificationContact");
        pOSTREQProductOrder.setBaseType("BaseType");
        pOSTREQProductOrder.setType("Type");
        pOSTREQProductOrder.setSchemaLocation("SchemaLocation");
        pOSTREQProductOrder.setChannel(new Channel());
        Note note = new Note();
        note.setText("Text");
        pOSTREQProductOrder.setNote(note);
        RelatedPartyRef relatedPartyRef = new RelatedPartyRef();
        relatedPartyRef.setHref("Href");
        relatedPartyRef.setRole("Role");
        pOSTREQProductOrder.setRelatedParty(List.of());
        PaymentRef paymentRef = new PaymentRef();
        paymentRef.setHref("Href");
        pOSTREQProductOrder.setPayment(List.of(paymentRef));
        BillingAccountRef billingAccountRef = new BillingAccountRef();
        billingAccountRef.setHref("Href");
        pOSTREQProductOrder.setBillingAccount(billingAccountRef);
        OrderPrice orderPrice = new OrderPrice();
        orderPrice.setPriceType(PriceType.ONETIME);
        orderPrice.setPrice(new Price());
        pOSTREQProductOrder.setOrderTotalPrice(List.of(orderPrice));
        POSTREQOrderItem postreqOrderItem = new POSTREQOrderItem();
        postreqOrderItem.setAction(ActionType.ADD);
        pOSTREQProductOrder.setOrderItem(List.of(postreqOrderItem));

        //create
        pOSTREQProductOrderDao.create(pOSTREQProductOrder);
        Long id = pOSTREQProductOrder.getId();
        assertNotNull(id);

        //read
        POSTREQProductOrder pOSTREQProductOrderRead = pOSTREQProductOrderDao.read(id);
        assertEquals("Description", pOSTREQProductOrderRead.getDescription());

        //update
        pOSTREQProductOrderRead.setDescription("New Description");
        pOSTREQProductOrderDao.update(pOSTREQProductOrderRead);
        POSTREQProductOrder pOSTREQProductOrderUpdate = pOSTREQProductOrderDao.read(id);
        assertEquals("New Description", pOSTREQProductOrderUpdate.getDescription());

        //delete
        pOSTREQProductOrderDao.delete(id);
        POSTREQProductOrder pOSTREQProductOrderDelete = pOSTREQProductOrderDao.read(id);
        assertNull(pOSTREQProductOrderDelete);
    }

    @Test
    @Commit
    public void getAll() {
        POSTREQProductOrder pOSTREQProductOrder1 = new POSTREQProductOrder();
        POSTREQProductOrder pOSTREQProductOrder2 = new POSTREQProductOrder();
        pOSTREQProductOrderDao.create(pOSTREQProductOrder1);
        pOSTREQProductOrderDao.create(pOSTREQProductOrder2);
        Long id1 = pOSTREQProductOrder1.getId();
        Long id2 = pOSTREQProductOrder2.getId();

        List<POSTREQProductOrder> pOSTREQProductOrderList = pOSTREQProductOrderDao.getAll();
        assertEquals(2, pOSTREQProductOrderList.size());

        pOSTREQProductOrderDao.delete(id1);
        pOSTREQProductOrderDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}