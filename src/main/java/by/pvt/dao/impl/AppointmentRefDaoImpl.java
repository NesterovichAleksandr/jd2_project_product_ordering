package by.pvt.dao.impl;

import by.pvt.dao.AppointmentRefDao;
import by.pvt.model.AppointmentRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class AppointmentRefDaoImpl<T> extends BaseDaoImpl<AppointmentRef, String> implements AppointmentRefDao {

    private static Logger log = Logger.getLogger(AppointmentRefDaoImpl.class.getName());

    @Autowired
    public AppointmentRefDaoImpl() {
        super(AppointmentRef.class);
    }
}
