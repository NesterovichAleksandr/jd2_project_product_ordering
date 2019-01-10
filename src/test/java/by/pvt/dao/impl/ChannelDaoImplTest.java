package by.pvt.dao.impl;

import by.pvt.dao.ChannelDao;
import by.pvt.model.Channel;
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
public class ChannelDaoImplTest {

    @Autowired
    ChannelDao channelDao;

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void crud() {
        Channel channel = new Channel();
        channel.setHref("TestHref");
        channel.setName("TestName");
        channel.setRole("TestRole");
        channel.setType("TestType");

        //create
        channelDao.create(channel);
        String id = channel.getId();
        assertNotNull(id);

        //read
        Channel channelRead = channelDao.read(id);
        assertEquals("TestHref", channelRead.getHref());

        //update
        channelRead.setType("New TestType");
        channelDao.update(channelRead);
        Channel channelUpdate = channelDao.read(id);
        assertEquals("New TestType", channelUpdate.getType());

        //delete
        channelDao.delete(id);
        Channel channelDelete = channelDao.read(id);
        assertNull(channelDelete);
    }

    @Test
    public void getAll() {
        Channel channel1 = new Channel();
        Channel channel2 = new Channel();
        channelDao.create(channel1);
        channelDao.create(channel2);
        String id1 = channel1.getId();
        String id2 = channel2.getId();

        List<Channel> channelList = channelDao.getAll();
        assertEquals(2, channelList.size());

        channelDao.delete(id1);
        channelDao.delete(id2);
    }

    @After
    public void tearDown() throws Exception {
    }
}