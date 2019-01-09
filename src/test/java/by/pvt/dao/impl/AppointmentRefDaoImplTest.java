package by.pvt.dao.impl;

import by.pvt.dao.AppointmentRefDao;
import by.pvt.model.AppointmentRef;
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
public class AppointmentRefDaoImplTest {

    @Autowired
    AppointmentRefDao appointmentRefDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        AppointmentRef appointmentRef = new AppointmentRef();
        appointmentRef.setHref("TestHref");
        appointmentRef.setType("TestType");

        //create
        appointmentRefDao.create(appointmentRef);
        String id = appointmentRef.getId();
        assertNotNull(id);

        //read
        AppointmentRef appointmentRef1 = appointmentRefDao.read(id);
        assertEquals("TestHref", appointmentRef1.getHref());

        //update
        appointmentRef1.setType("New TestType");
        appointmentRefDao.update(appointmentRef1);
        AppointmentRef appointmentRef2 = appointmentRefDao.read(id);
        assertEquals("New TestType", appointmentRef2.getType());

        //delete
        appointmentRefDao.delete(id);
        AppointmentRef appointmentRefDelete = appointmentRefDao.read(id);
        assertNull(appointmentRefDelete);
    }

    @Test
    public void getAll() {
        AppointmentRef appointmentRef1 = new AppointmentRef();
        appointmentRef1.setHref("Href1");
        AppointmentRef appointmentRef2 = new AppointmentRef();
        appointmentRef2.setHref("Href2");
        appointmentRefDao.create(appointmentRef1);
        appointmentRefDao.create(appointmentRef2);
        String id1 = appointmentRef1.getId();
        String id2 = appointmentRef2.getId();

        List<AppointmentRef> appointmentRefList = appointmentRefDao.getAll();
        assertEquals(2, appointmentRefList.size());

        appointmentRefDao.delete(id1);
        appointmentRefDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}