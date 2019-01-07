package by.pvt.dao.impl;

import by.pvt.dao.QualificationRefDao;
import by.pvt.model.QualificationRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QualificationRefDaoImpl extends BaseDaoImpl<QualificationRef, String> implements QualificationRefDao {

    @Autowired
    QualificationRefDaoImpl() {
        super(QualificationRef.class);
    }
}
