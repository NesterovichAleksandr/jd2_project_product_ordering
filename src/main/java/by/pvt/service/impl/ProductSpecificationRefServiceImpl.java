package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.ProductSpecificationRef;
import by.pvt.service.ProductSpecificationRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductSpecificationRefServiceImpl extends BaseServiceImpl<ProductSpecificationRef, String> implements ProductSpecificationRefService {

    @Autowired
    public ProductSpecificationRefServiceImpl(BaseDao<ProductSpecificationRef, String> dao) {
        super(dao);
    }
}
