package az.turing.springjdbctemplateexcample.service;

import az.turing.springjdbctemplateexcample.domain.entity.UserEntity;
import az.turing.springjdbctemplateexcample.domain.repository.UserRepository;
import az.turing.springjdbctemplateexcample.mapper.UserMapper;
import az.turing.springjdbctemplateexcample.model.dto.reponse.UserDto;
import az.turing.springjdbctemplateexcample.model.dto.request.CreateUserRequest;
import az.turing.springjdbctemplateexcample.model.dto.request.UpdateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public List<UserDto> findAll() {
        List<UserEntity> entityList=repository.getAll();

        return entityList.stream().
                map(mapper::toDto).
                collect(Collectors.toList());
    }

    public UserDto createUser(CreateUserRequest request) {

        UserEntity user=new UserEntity();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setGroup(request.getGroup());

        UserEntity savedEntity =repository.save(user);

        return mapper.toDto(savedEntity);
    }

    public UserDto updateUser(Long id, UpdateUserRequest request) {

        //UserEntity user=new UserEntity();

        UserEntity savedEntity =repository.save(user);

        return mapper.toDto(savedEntity);

    }

}
