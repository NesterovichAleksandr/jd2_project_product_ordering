package by.pvt.dao.impl;

import by.pvt.dao.ProductRelationshipDao;
import by.pvt.model.ProductRelationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRelationshipDaoImpl extends BaseDaoImpl<ProductRelationship, Long> implements ProductRelationshipDao {

    @Autowired
    ProductRelationshipDaoImpl() {
        super(ProductRelationship.class);
    }
}
