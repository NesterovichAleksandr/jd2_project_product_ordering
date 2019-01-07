package by.pvt.dao.impl;

import by.pvt.dao.PriceDao;
import by.pvt.model.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PriceDaoImpl extends BaseDaoImpl<Price, Long> implements PriceDao {

    @Autowired
    PriceDaoImpl() {
        super(Price.class);
    }
}
