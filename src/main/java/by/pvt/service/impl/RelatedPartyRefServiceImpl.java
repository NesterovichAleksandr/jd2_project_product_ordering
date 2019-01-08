package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.RelatedPartyRef;
import by.pvt.service.RelatedPartyRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RelatedPartyRefServiceImpl extends BaseServiceImpl<RelatedPartyRef, String> implements RelatedPartyRefService {

    @Autowired
    public RelatedPartyRefServiceImpl(BaseDao<RelatedPartyRef, String> dao) {
        super(dao);
    }
}
