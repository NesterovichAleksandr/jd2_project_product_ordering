package by.pvt.dao.impl;

import by.pvt.dao.PriceDao;
import by.pvt.model.Money;
import by.pvt.model.Price;
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
public class PriceDaoImplTest {

    @Autowired
    PriceDao priceDao;

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
        Price price = new Price();
        Money money = new Money();
        money.setUnit("Unit");
        money.setValue(34F);
        price.setTaxIncludedAmount(money);
        price.setDutyFreeAmount(money);
        price.setTaxRate(12.0F);
        price.setPercentage(13F);
        price.setType("TestType");
        price.setSchemaLocation("SchemaLocation");

        //create
        priceDao.create(price);
        Long id = price.getId();
        assertNotNull(id);

        //read
        Price priceRead = priceDao.read(id);
        assertEquals("TestType", priceRead.getType());

        //update
        priceRead.setType("New TestType");
        priceDao.update(priceRead);
        Price priceUpdate = priceDao.read(id);
        assertEquals("New TestType", priceUpdate.getType());

        //delete
        priceDao.delete(id);
        Price priceDelete = priceDao.read(id);
        assertNull(priceDelete);
    }

    @Test
    @Commit
    public void getAll() {
        Price price1 = new Price();
        Price price2 = new Price();
        priceDao.create(price1);
        priceDao.create(price2);
        Long id1 = price1.getId();
        Long id2 = price2.getId();

        List<Price> priceList = priceDao.getAll();
        assertEquals(2, priceList.size());

        priceDao.delete(id1);
        priceDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}