package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.QualificationRef;
import by.pvt.service.QualificationRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QualificationRefServiceImpl extends BaseServiceImpl<QualificationRef, String> implements QualificationRefService {

    @Autowired
    public QualificationRefServiceImpl(BaseDao<QualificationRef, String> dao) {
        super(dao);
    }
}
