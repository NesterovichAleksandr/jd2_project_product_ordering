package by.pvt.dao.impl;

import by.pvt.dao.PlaceDao;
import by.pvt.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlaceDaoImpl extends BaseDaoImpl<Place, String> implements PlaceDao {

    @Autowired
    PlaceDaoImpl() {
        super(Place.class);
    }
}
