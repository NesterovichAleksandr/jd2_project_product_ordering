package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.PaymentRef;
import by.pvt.service.PaymentRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaymentRefServiceImpl extends BaseServiceImpl<PaymentRef, String> implements PaymentRefService {

    @Autowired
    public PaymentRefServiceImpl(BaseDao<PaymentRef, String> dao) {
        super(dao);
    }
}
