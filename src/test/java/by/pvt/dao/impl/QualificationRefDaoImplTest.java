package by.pvt.dao.impl;

import by.pvt.dao.QualificationRefDao;
import by.pvt.model.QualificationRef;
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
public class QualificationRefDaoImplTest {

    @Autowired
    QualificationRefDao qualificationRefDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        QualificationRef qualificationRef = new QualificationRef();
        qualificationRef.setHref("TestHref");
        qualificationRef.setQualificationItemId("QualificationItemId");
        qualificationRef.setType("TestType");

        //create
        qualificationRefDao.create(qualificationRef);
        String id = qualificationRef.getId();
        assertNotNull(id);

        //read
        QualificationRef qualificationRefRead = qualificationRefDao.read(id);
        assertEquals("TestHref", qualificationRefRead.getHref());

        //update
        qualificationRefRead.setType("New TestType");
        qualificationRefDao.update(qualificationRefRead);
        QualificationRef qualificationRefUpdate = qualificationRefDao.read(id);
        assertEquals("New TestType", qualificationRefUpdate.getType());

        //delete
        qualificationRefDao.delete(id);
        QualificationRef qualificationRefDelete = qualificationRefDao.read(id);
        assertNull(qualificationRefDelete);
    }

    @Test
    public void getAll() {
        QualificationRef qualificationRef1 = new QualificationRef();
        qualificationRef1.setHref("Href1");
        QualificationRef qualificationRef2 = new QualificationRef();
        qualificationRef2.setHref("Href2");
        qualificationRefDao.create(qualificationRef1);
        qualificationRefDao.create(qualificationRef2);
        String id1 = qualificationRef1.getId();
        String id2 = qualificationRef2.getId();

        List<QualificationRef> qualificationRefList = qualificationRefDao.getAll();
        assertEquals(2, qualificationRefList.size());

        qualificationRefDao.delete(id1);
        qualificationRefDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}