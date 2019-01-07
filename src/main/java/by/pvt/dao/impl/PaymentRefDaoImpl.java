package by.pvt.dao.impl;

import by.pvt.dao.PaymentRefDao;
import by.pvt.model.PaymentRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRefDaoImpl extends BaseDaoImpl<PaymentRef, String> implements PaymentRefDao {

    @Autowired
    PaymentRefDaoImpl() {
        super(PaymentRef.class);
    }
}
