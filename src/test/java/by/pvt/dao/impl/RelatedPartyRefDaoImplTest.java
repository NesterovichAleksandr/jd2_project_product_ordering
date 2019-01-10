package by.pvt.dao.impl;

import by.pvt.dao.RelatedPartyRefDao;
import by.pvt.model.RelatedPartyRef;
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
public class RelatedPartyRefDaoImplTest {

    @Autowired
    RelatedPartyRefDao relatedPartyRefDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        RelatedPartyRef relatedPartyRef = new RelatedPartyRef();
        relatedPartyRef.setHref("TestHref");
        relatedPartyRef.setName("TestName");
        relatedPartyRef.setRole("TestRole");
        relatedPartyRef.setType("TestType");

        //create
        relatedPartyRefDao.create(relatedPartyRef);
        String id = relatedPartyRef.getId();
        assertNotNull(id);

        //read
        RelatedPartyRef relatedPartyRefRead = relatedPartyRefDao.read(id);
        assertEquals("TestHref", relatedPartyRefRead.getHref());

        //update
        relatedPartyRefRead.setType("New TestType");
        relatedPartyRefDao.update(relatedPartyRefRead);
        RelatedPartyRef relatedPartyRefUpdate = relatedPartyRefDao.read(id);
        assertEquals("New TestType", relatedPartyRefUpdate.getType());

        //delete
        relatedPartyRefDao.delete(id);
        RelatedPartyRef relatedPartyRefDelete = relatedPartyRefDao.read(id);
        assertNull(relatedPartyRefDelete);
    }

    @Test
    public void getAll() {
        RelatedPartyRef relatedPartyRef1 = new RelatedPartyRef();
        relatedPartyRef1.setHref("Href1");
        relatedPartyRef1.setRole("Role1");
        RelatedPartyRef relatedPartyRef2 = new RelatedPartyRef();
        relatedPartyRef2.setHref("Href2");
        relatedPartyRef2.setRole("Role2");
        relatedPartyRefDao.create(relatedPartyRef1);
        relatedPartyRefDao.create(relatedPartyRef2);
        String id1 = relatedPartyRef1.getId();
        String id2 = relatedPartyRef2.getId();

        List<RelatedPartyRef> relatedPartyRefList = relatedPartyRefDao.getAll();
        assertEquals(2, relatedPartyRefList.size());

        relatedPartyRefDao.delete(id1);
        relatedPartyRefDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}