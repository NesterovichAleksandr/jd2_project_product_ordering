package by.pvt.utils.convector;

import by.pvt.model.RelatedPartyRef;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotNull;
import java.util.List;

public class RelatedPartyRefConvectorImpl {

    private static final Logger log = LogManager.getLogger(RelatedPartyRefConvectorImpl.class);

    public RelatedPartyRef updateConvectorToEntity(RelatedPartyRef entity, RelatedPartyRef dto) {

        @NotNull String id = entity.getId();
        BeanUtils.copyProperties(dto, entity);
        entity.setId(id);

        return entity;
    }

    public RelatedPartyRef convectorToNewEntity(RelatedPartyRef dto) {
        RelatedPartyRef relatedPartyRef = new RelatedPartyRef();

        try {
            relatedPartyRef.setHref(dto.getHref()); //add Logger
        } catch (Exception e) {
            log.error("field href in table RelatedPartyRef must be filled ", e);
        }
        if (dto.getName() != null) {
            relatedPartyRef.setName(dto.getName());
        }
        if (dto.getRole() != null) {
            relatedPartyRef.setRole(dto.getRole());
        }
        if (dto.getType() != null) {
            relatedPartyRef.setType(dto.getType());
        }
        return relatedPartyRef;
    }

    public List<RelatedPartyRef> updateConvectorToEntityList(List<RelatedPartyRef> listEntity, List<RelatedPartyRef> listDto) {

        for (RelatedPartyRef p : listDto) {
            if (!listEntity.contains(p)) {
                listEntity.add(convectorToNewEntity(p));
            }
        }
        return listEntity;
    }
}
