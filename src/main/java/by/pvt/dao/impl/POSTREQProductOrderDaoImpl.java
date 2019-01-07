package by.pvt.dao.impl;

import by.pvt.dao.POSTREQProductOrderDao;
import by.pvt.model.POSTREQProductOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class POSTREQProductOrderDaoImpl extends BaseDaoImpl<POSTREQProductOrder, Long> implements POSTREQProductOrderDao {

    @Autowired
    POSTREQProductOrderDaoImpl() {
        super(POSTREQProductOrder.class);
    }
}
