package by.pvt.dao.impl;

import by.pvt.dao.OrderItemRelationShipDao;
import by.pvt.model.OrderItemRelationShip;
import by.pvt.model.RelationShipType;
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
public class OrderItemRelationShipDaoImplTest {

    @Autowired
    OrderItemRelationShipDao orderItemRelationShipDao;

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
        OrderItemRelationShip orderItemRelationShip = new OrderItemRelationShip();
        orderItemRelationShip.setType(RelationShipType.BRINGS);

        //create
        orderItemRelationShipDao.create(orderItemRelationShip);
        String id = orderItemRelationShip.getId();
        assertNotNull(id);

        //read
        OrderItemRelationShip orderItemRelationShipRead = orderItemRelationShipDao.read(id);
        assertEquals(RelationShipType.BRINGS, orderItemRelationShipRead.getType());

        //update
        orderItemRelationShipRead.setType(RelationShipType.HASCHILD);
        orderItemRelationShipDao.update(orderItemRelationShipRead);
        OrderItemRelationShip orderItemRelationShipUpdate = orderItemRelationShipDao.read(id);
        assertEquals(RelationShipType.HASCHILD, orderItemRelationShipUpdate.getType());

        //delete
        orderItemRelationShipDao.delete(id);
        OrderItemRelationShip orderItemRelationShipDelete = orderItemRelationShipDao.read(id);
        assertNull(orderItemRelationShipDelete);
    }

    @Test
    @Commit
    public void getAll() {
        OrderItemRelationShip orderItemRelationShip1 = new OrderItemRelationShip();
        orderItemRelationShip1.setType(RelationShipType.HASCHILD);
        OrderItemRelationShip orderItemRelationShip2 = new OrderItemRelationShip();
        orderItemRelationShip2.setType(RelationShipType.HASCHILD);
        orderItemRelationShipDao.create(orderItemRelationShip1);
        orderItemRelationShipDao.create(orderItemRelationShip2);
        String id1 = orderItemRelationShip1.getId();
        String id2 = orderItemRelationShip2.getId();

        List<OrderItemRelationShip> orderItemRelationShipList = orderItemRelationShipDao.getAll();
        assertEquals(2, orderItemRelationShipList.size());

        orderItemRelationShipDao.delete(id1);
        orderItemRelationShipDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}