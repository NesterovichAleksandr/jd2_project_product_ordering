package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.Place;
import by.pvt.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlaceServiceImpl extends BaseServiceImpl<Place, String> implements PlaceService {

    @Autowired
    public PlaceServiceImpl(BaseDao<Place, String> dao) {
        super(dao);
    }
}
