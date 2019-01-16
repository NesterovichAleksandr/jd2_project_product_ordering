package by.pvt.utils.convector;

import by.pvt.model.Channel;

public class ChannelConvectorImpl {

    public Channel updateConvectorToEntity(Channel entity, Channel dto) {

        if (dto.getHref() != null) {
            entity.setHref(dto.getHref());
        }
        if (dto.getName() != null) {
            entity.setName(dto.getName());
        }
        if (dto.getRole() != null) {
            entity.setRole(dto.getRole());
        }
        if (dto.getType() != null) {
            entity.setType(dto.getType());
        }
        return entity;
    }
}
