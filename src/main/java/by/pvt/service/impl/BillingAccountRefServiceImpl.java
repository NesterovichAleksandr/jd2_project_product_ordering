package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.BillingAccountRef;
import by.pvt.service.BillingAccountRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BillingAccountRefServiceImpl extends BaseServiceImpl<BillingAccountRef, String> implements BillingAccountRefService {

    @Autowired
    public BillingAccountRefServiceImpl(BaseDao<BillingAccountRef, String> dao) {
        super(dao);
    }
}
