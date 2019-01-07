package by.pvt.dao.impl;

import by.pvt.dao.ProductDao;
import by.pvt.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl extends BaseDaoImpl<Product, String> implements ProductDao {

    @Autowired
    ProductDaoImpl() {
        super(Product.class);
    }
}
