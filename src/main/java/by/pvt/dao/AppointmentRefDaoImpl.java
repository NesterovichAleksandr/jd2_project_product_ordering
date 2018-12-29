package by.pvt.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class AppointmentRefDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(AppointmentRefDaoImpl.class.getName());

    @Override
    public List<T> find() {
        return null;
    }

}
