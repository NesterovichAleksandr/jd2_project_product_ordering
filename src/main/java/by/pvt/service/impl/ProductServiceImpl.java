package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.Product;
import by.pvt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl extends BaseServiceImpl<Product, String> implements ProductService {

    @Autowired
    public ProductServiceImpl(BaseDao<Product, String> dao) {
        super(dao);
    }
}
