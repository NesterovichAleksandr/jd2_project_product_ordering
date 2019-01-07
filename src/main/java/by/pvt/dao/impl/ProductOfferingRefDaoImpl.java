package by.pvt.dao.impl;

import by.pvt.dao.ProductOfferingRefDao;
import by.pvt.model.ProductOfferingRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductOfferingRefDaoImpl extends BaseDaoImpl<ProductOfferingRef, String> implements ProductOfferingRefDao {

    @Autowired
    ProductOfferingRefDaoImpl() {
        super(ProductOfferingRef.class);
    }
}
