package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.ProductRelationship;
import by.pvt.service.ProductRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductRelationshipServiceImpl extends BaseServiceImpl<ProductRelationship, Long> implements ProductRelationshipService {

    @Autowired
    public ProductRelationshipServiceImpl(BaseDao<ProductRelationship, Long> dao) {
        super(dao);
    }
}
