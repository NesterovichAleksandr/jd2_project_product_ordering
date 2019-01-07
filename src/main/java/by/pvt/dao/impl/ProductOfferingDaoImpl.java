package by.pvt.dao.impl;

import by.pvt.dao.ProductOfferingDao;
import by.pvt.model.ProductOffering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductOfferingDaoImpl extends BaseDaoImpl<ProductOffering, String> implements ProductOfferingDao {

    @Autowired
    ProductOfferingDaoImpl() {
        super(ProductOffering.class);
    }
}
