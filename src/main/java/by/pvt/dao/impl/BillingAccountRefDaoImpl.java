package by.pvt.dao.impl;

import by.pvt.dao.BillingAccountRefDao;
import by.pvt.model.BillingAccountRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BillingAccountRefDaoImpl extends BaseDaoImpl<BillingAccountRef, String> implements BillingAccountRefDao {

    @Autowired
    BillingAccountRefDaoImpl() {
        super(BillingAccountRef.class);
    }
}
