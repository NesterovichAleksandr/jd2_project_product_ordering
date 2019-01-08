package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.AppointmentRef;
import by.pvt.service.AppointmentRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AppointmentRefServiceImpl extends BaseServiceImpl<AppointmentRef, String> implements AppointmentRefService {

    @Autowired
    public AppointmentRefServiceImpl(BaseDao<AppointmentRef, String> dao) {
        super(dao);
    }
}
