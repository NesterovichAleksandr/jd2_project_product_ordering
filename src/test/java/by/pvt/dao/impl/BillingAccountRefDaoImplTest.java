package by.pvt.dao.impl;

import by.pvt.dao.BillingAccountRefDao;
import by.pvt.model.BillingAccountRef;
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
public class BillingAccountRefDaoImplTest {

    @Autowired
    BillingAccountRefDao billingAccountRefDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        BillingAccountRef billingAccountRef = new BillingAccountRef();
        billingAccountRef.setHref("TestHref");
        billingAccountRef.setName("TestName");
        billingAccountRef.setType("TestType");

        //create
        billingAccountRefDao.create(billingAccountRef);
        String id = billingAccountRef.getId();
        assertNotNull(id);

        //read
        BillingAccountRef billingAccountRef1 = billingAccountRefDao.read(id);
        assertEquals("TestHref", billingAccountRef1.getHref());

        //update
        billingAccountRef1.setType("New TestType");
        billingAccountRefDao.update(billingAccountRef1);
        BillingAccountRef billingAccountRef2 = billingAccountRefDao.read(id);
        assertEquals("New TestType", billingAccountRef2.getType());

        //delete
        billingAccountRefDao.delete(id);
        BillingAccountRef billingAccountRefDelete = billingAccountRefDao.read(id);
        assertNull(billingAccountRefDelete);
    }

    @Test
    public void getAll() {
        BillingAccountRef billingAccountRef1 = new BillingAccountRef();
        billingAccountRef1.setHref("Href1");
        BillingAccountRef billingAccountRef2 = new BillingAccountRef();
        billingAccountRef2.setHref("Href2");
        billingAccountRefDao.create(billingAccountRef1);
        billingAccountRefDao.create(billingAccountRef2);
        String id1 = billingAccountRef1.getId();
        String id2 = billingAccountRef2.getId();

        List<BillingAccountRef> billingAccountRefList = billingAccountRefDao.getAll();
        assertEquals(2, billingAccountRefList.size());

        billingAccountRefDao.delete(id1);
        billingAccountRefDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}