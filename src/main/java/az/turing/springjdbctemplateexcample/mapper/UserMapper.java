package az.turing.springjdbctemplateexcample.mapper;

import az.turing.springjdbctemplateexcample.domain.entity.UserEntity;
import az.turing.springjdbctemplateexcample.model.dto.reponse.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements EntityMapper<UserEntity, UserDto> {


    @Override
    public UserEntity toEnt(UserDto userDto) {
        return UserEntity.builder()
                .name(userDto.getName())
                .group(userDto.getGroup())
                .build();
    }

    @Override
    public UserDto toDto(UserEntity userEntity) {
        return UserDto.builder()
                .name(userEntity.getName())
                .group(userEntity.getGroup())
                .build();
    }
}
