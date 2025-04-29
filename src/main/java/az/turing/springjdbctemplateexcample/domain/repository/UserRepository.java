package az.turing.springjdbctemplateexcample.domain.repository;

import az.turing.springjdbctemplateexcample.domain.entity.UserEntity;

import java.util.List;

 public interface UserRepository {

    UserEntity save(UserEntity user);

    List<UserEntity> getAll();

    UserEntity findById(long id);

    void delete(long id);

}
