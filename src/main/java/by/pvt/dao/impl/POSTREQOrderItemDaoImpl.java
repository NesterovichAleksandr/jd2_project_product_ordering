package by.pvt.dao.impl;

import by.pvt.dao.POSTREQOrderItemDao;
import by.pvt.model.POSTREQOrderItem;
import org.springframework.beans.factory.annotation.Autowired;

public class POSTREQOrderItemDaoImpl extends BaseDaoImpl<POSTREQOrderItem, String> implements POSTREQOrderItemDao {

    @Autowired
    public POSTREQOrderItemDaoImpl() {
        super(POSTREQOrderItem.class);
    }
}
