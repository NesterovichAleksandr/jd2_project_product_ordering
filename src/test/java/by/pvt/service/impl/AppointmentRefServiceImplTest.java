package by.pvt.service.impl;

import by.pvt.model.AppointmentRef;
import by.pvt.service.AppointmentRefService;
import io.swagger.configuration.HibernateXMLConfTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class AppointmentRefServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    AppointmentRefService objUnderTest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createReadUpdateDeleteTest() {
        //create
        AppointmentRef appointmentRef = new AppointmentRef();
        appointmentRef.setHref("appointmentRefTestHref");
        objUnderTest.create(appointmentRef);
        String id = appointmentRef.getId();
        assertNotNull(id);

        //read
        AppointmentRef appointmentRef1 = objUnderTest.read(id);
        assertEquals("appointmentRefTestHref", appointmentRef1.getHref());

        //update
        appointmentRef1.setType("TestType");
        objUnderTest.update(appointmentRef1);
        AppointmentRef appointmentRefTestUpdate = objUnderTest.read(id);
        assertEquals("TestType", appointmentRefTestUpdate.getType());

        //delete
        objUnderTest.delete(id);
        AppointmentRef appointmentRefDelete = objUnderTest.read(id);
        assertNull(appointmentRefDelete);
    }

    @Test
    public void getAllTest() {
        AppointmentRef appointmentRef1 = new AppointmentRef();
        appointmentRef1.setHref("TestHref1");
        AppointmentRef appointmentRef2 = new AppointmentRef();
        appointmentRef2.setHref("TestHref2");
        objUnderTest.create(appointmentRef1);
        objUnderTest.create(appointmentRef2);
        String id1 = appointmentRef1.getId();
        String id2 = appointmentRef2.getId();

        List<AppointmentRef> appointmentRefList = objUnderTest.getAll();
        assertEquals(id1, appointmentRefList.get(0).getId());
        assertEquals(id2, appointmentRefList.get(1).getId());

        objUnderTest.delete(id1);
        objUnderTest.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}