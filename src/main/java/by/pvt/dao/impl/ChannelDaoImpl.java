package by.pvt.dao.impl;

import by.pvt.dao.ChannelDao;
import by.pvt.model.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelDaoImpl extends BaseDaoImpl<Channel, String> implements ChannelDao {

    @Autowired
    ChannelDaoImpl() {
        super(Channel.class);
    }
}
