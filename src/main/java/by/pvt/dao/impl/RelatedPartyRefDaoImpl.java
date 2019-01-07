package by.pvt.dao.impl;

import by.pvt.dao.RelatedPartyRefDao;
import by.pvt.model.RelatedPartyRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RelatedPartyRefDaoImpl extends BaseDaoImpl<RelatedPartyRef, String> implements RelatedPartyRefDao {

    @Autowired
    RelatedPartyRefDaoImpl() {
        super(RelatedPartyRef.class);
    }
}
