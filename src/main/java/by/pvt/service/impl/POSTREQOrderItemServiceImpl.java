package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.POSTREQOrderItem;
import by.pvt.service.POSTREQOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class POSTREQOrderItemServiceImpl extends BaseServiceImpl<POSTREQOrderItem, String> implements POSTREQOrderItemService {

    @Autowired
    public POSTREQOrderItemServiceImpl(BaseDao<POSTREQOrderItem, String> dao) {
        super(dao);
    }
}
