package io.swagger.service;

import io.swagger.dao.BaseDaoImpl;
import io.swagger.model.ProductOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class BaseServiceImpl<T> {

    private static Logger log = Logger.getLogger(BaseServiceImpl.class.getName());

    @Autowired
    private BaseDaoImpl<ProductOrder> productOrderBaseDao;

    public List<T> list() {
        log.info(" productOrderBaseDao: " + productOrderBaseDao);

        return (List<T>) productOrderBaseDao.find();
    }


}
