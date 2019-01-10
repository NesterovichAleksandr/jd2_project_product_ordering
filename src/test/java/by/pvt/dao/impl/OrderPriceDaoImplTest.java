package by.pvt.dao.impl;

import by.pvt.dao.OrderPriceDao;
import by.pvt.model.BillingAccountRef;
import by.pvt.model.OrderPrice;
import by.pvt.model.Price;
import by.pvt.model.PriceType;
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
public class OrderPriceDaoImplTest {

    @Autowired
    OrderPriceDao orderPriceDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        OrderPrice orderPrice = new OrderPrice();
        orderPrice.setName("TestName");
        orderPrice.setDescription("TestDescription");
        orderPrice.setPriceType(PriceType.ONETIME);
        orderPrice.setUnitOfMeasure("UnitOfMeasure");
        orderPrice.setRecurringChargePeriod("RecurringChargePeriod");
        orderPrice.setType("TestType");
        orderPrice.setSchemaLocation("SchemaLocation");
        Price price = new Price();
        orderPrice.setPrice(price);
        orderPrice.setPriceAlteration(List.of());
        BillingAccountRef billingAccountRef = new BillingAccountRef();
        orderPrice.setBillingAccount(billingAccountRef);

        //create
        orderPriceDao.create(orderPrice);
        Long id = orderPrice.getId();
        assertNotNull(id);

        //read
        OrderPrice orderPrice1 = orderPriceDao.read(id);
        assertEquals("TestName", orderPrice1.getName());

        //update
        orderPrice1.setType("New TestType");
        orderPriceDao.update(orderPrice1);
        OrderPrice orderPrice2 = orderPriceDao.read(id);
        assertEquals("New TestType", orderPrice2.getType());

        //delete
        orderPriceDao.delete(id);
        OrderPrice orderPriceDelete = orderPriceDao.read(id);
        assertNull(orderPriceDelete);
    }

    @Test
    public void getAll() {
        Price price = new Price();
        OrderPrice orderPrice1 = new OrderPrice();
        orderPrice1.setPriceType(PriceType.ONETIME);
        orderPrice1.setPrice(price);
        OrderPrice orderPrice2 = new OrderPrice();
        orderPrice2.setPriceType(PriceType.USAGE);
        orderPrice2.setPrice(price);
        orderPriceDao.create(orderPrice1);
        orderPriceDao.create(orderPrice2);
        Long id1 = orderPrice1.getId();
        Long id2 = orderPrice2.getId();

        List<OrderPrice> orderPriceList = orderPriceDao.getAll();
        assertEquals(2, orderPriceList.size());

        orderPriceDao.delete(id1);
        orderPriceDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}