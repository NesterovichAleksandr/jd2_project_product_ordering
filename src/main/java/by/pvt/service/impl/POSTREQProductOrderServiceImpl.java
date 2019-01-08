package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.POSTREQProductOrder;
import by.pvt.service.POSTREQProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class POSTREQProductOrderServiceImpl extends BaseServiceImpl<POSTREQProductOrder, Long> implements POSTREQProductOrderService {

    @Autowired
    public POSTREQProductOrderServiceImpl(BaseDao<POSTREQProductOrder, Long> dao) {
        super(dao);
    }
}
