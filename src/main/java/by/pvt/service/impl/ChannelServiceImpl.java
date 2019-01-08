package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.Channel;
import by.pvt.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChannelServiceImpl extends BaseServiceImpl<Channel, String> implements ChannelService {

    @Autowired
    public ChannelServiceImpl(BaseDao<Channel, String> dao) {
        super(dao);
    }
}
