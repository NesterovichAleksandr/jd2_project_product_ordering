package by.pvt.dao.impl;

import by.pvt.dao.ProductOrderDao;
import by.pvt.model.ProductOrder;
import by.pvt.utils.CreateAndFillEntity;
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
public class ProductOrderDaoImplTest {

    @Autowired
    ProductOrderDao productOrderDao;

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
        ProductOrder productOrder = CreateAndFillEntity.productOrder("TestCRUD");

        //create
        productOrderDao.create(productOrder);
        String id = productOrder.getId();
        assertNotNull(id);

        //read
        ProductOrder productOrder1 = productOrderDao.read(id);
        assertEquals("Description_TestCRUD", productOrder1.getDescription());

        //update
        productOrder1.setDescription("New DescriptionTestCRUD");
        productOrderDao.update(productOrder1);
        ProductOrder productOrder2 = productOrderDao.read(id);
        assertEquals("New DescriptionTestCRUD", productOrder2.getDescription());

        //delete
        productOrderDao.delete(id);
        ProductOrder productOrderDelete = productOrderDao.read(id);
        assertNull(productOrderDelete);
    }

    @Test
    @Commit
    public void getAll() {
        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        productOrderDao.create(productOrder1);
        productOrderDao.create(productOrder2);
        String id1 = productOrder1.getId();
        String id2 = productOrder2.getId();

        List<ProductOrder> productOrderList = productOrderDao.getAll();
        assertEquals(2, productOrderList.size());

        productOrderDao.delete(id1);
        productOrderDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}