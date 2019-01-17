package by.pvt.utils.convector;

import by.pvt.model.Channel;

public class ChannelConvectorImpl {

    public Channel convectorToNewEntity(Channel dto) {
        Channel channel = new Channel();
        channel.setHref(dto.getHref());
        channel.setName(dto.getName());
        channel.setRole(dto.getRole());
        channel.setType(dto.getType());

        return channel;
    }

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
