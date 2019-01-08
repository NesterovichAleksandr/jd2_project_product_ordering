package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.Price;
import by.pvt.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PriceServiceImpl extends BaseServiceImpl<Price, Long> implements PriceService {

    @Autowired
    public PriceServiceImpl(BaseDao<Price, Long> dao) {
        super(dao);
    }
}
