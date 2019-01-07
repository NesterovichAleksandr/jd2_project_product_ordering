package by.pvt.dao.impl;

import by.pvt.dao.ProductSpecificationRefDao;
import by.pvt.model.ProductSpecificationRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductSpecificationRefDaoImpl extends BaseDaoImpl<ProductSpecificationRef, String> implements ProductSpecificationRefDao {

    @Autowired
    ProductSpecificationRefDaoImpl() {
        super(ProductSpecificationRef.class);
    }
}
