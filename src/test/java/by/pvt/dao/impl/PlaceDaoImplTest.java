package by.pvt.dao.impl;

import by.pvt.dao.PlaceDao;
import by.pvt.model.Place;
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
public class PlaceDaoImplTest {

    @Autowired
    PlaceDao placeDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        Place place = new Place();
        place.setHref("TestHref");
        place.setName("TestName");
        place.setRole("TestRole");
        place.setType("TestType");
        place.setSchemaLocation("TestSchemaLocation");

        //create
        placeDao.create(place);
        String id = place.getId();
        assertNotNull(id);

        //read
        Place placeRead = placeDao.read(id);
        assertEquals("TestHref", placeRead.getHref());

        //update
        placeRead.setType("New TestType");
        placeDao.update(placeRead);
        Place placeUpdate = placeDao.read(id);
        assertEquals("New TestType", placeUpdate.getType());

        //delete
        placeDao.delete(id);
        Place placeDelete = placeDao.read(id);
        assertNull(placeDelete);
    }

    @Test
    public void getAll() {
        Place place1 = new Place();
        place1.setRole("Role1");
        Place place2 = new Place();
        place2.setRole("Role2");
        placeDao.create(place1);
        placeDao.create(place2);
        String id1 = place1.getId();
        String id2 = place2.getId();

        List<Place> placeList = placeDao.getAll();
        assertEquals(2, placeList.size());

        placeDao.delete(id1);
        placeDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}