package by.pvt.dao.impl;

import by.pvt.dao.PaymentRefDao;
import by.pvt.model.PaymentRef;
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
public class PaymentRefDaoImplTest {

    @Autowired
    PaymentRefDao paymentRefDao;

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
        PaymentRef paymentRef = new PaymentRef();
        paymentRef.setHref("TestHref");
        paymentRef.setName("TestName");
        paymentRef.setType("TestType");

        //create
        paymentRefDao.create(paymentRef);
        String id = paymentRef.getId();
        assertNotNull(id);

        //read
        PaymentRef paymentRef1 = paymentRefDao.read(id);
        assertEquals("TestHref", paymentRef1.getHref());

        //update
        paymentRef1.setType("New TestType");
        paymentRefDao.update(paymentRef1);
        PaymentRef paymentRef2 = paymentRefDao.read(id);
        assertEquals("New TestType", paymentRef2.getType());

        //delete
        paymentRefDao.delete(id);
        PaymentRef paymentRefDelete = paymentRefDao.read(id);
        assertNull(paymentRefDelete);
    }

    @Test
    @Commit
    public void getAll() {
        PaymentRef paymentRef1 = new PaymentRef();
        paymentRef1.setHref("Href1");
        PaymentRef paymentRef2 = new PaymentRef();
        paymentRef2.setHref("Href2");
        paymentRefDao.create(paymentRef1);
        paymentRefDao.create(paymentRef2);
        String id1 = paymentRef1.getId();
        String id2 = paymentRef2.getId();

        List<PaymentRef> paymentRefList = paymentRefDao.getAll();
        assertEquals(2, paymentRefList.size());

        paymentRefDao.delete(id1);
        paymentRefDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}