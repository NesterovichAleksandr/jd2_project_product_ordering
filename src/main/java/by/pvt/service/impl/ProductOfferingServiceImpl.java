package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.ProductOffering;
import by.pvt.service.ProductOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductOfferingServiceImpl extends BaseServiceImpl<ProductOffering, String> implements ProductOfferingService {

    @Autowired
    public ProductOfferingServiceImpl(BaseDao<ProductOffering, String> dao) {
        super(dao);
    }
}
