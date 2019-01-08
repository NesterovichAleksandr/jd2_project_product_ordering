package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.ProductOfferingRef;
import by.pvt.service.ProductOfferingRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductOfferingRefServiceImpl extends BaseServiceImpl<ProductOfferingRef, String> implements ProductOfferingRefService {

    @Autowired
    public ProductOfferingRefServiceImpl(BaseDao<ProductOfferingRef, String> dao) {
        super(dao);
    }
}
