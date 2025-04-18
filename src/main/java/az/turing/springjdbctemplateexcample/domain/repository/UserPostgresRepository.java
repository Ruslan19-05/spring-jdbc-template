package az.turing.springjdbctemplateexcample.domain.repository;

import az.turing.springjdbctemplateexcample.domain.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

 public interface UserPostgresRepository {

    User create(User user);

    List<User> getAll();

    User findById(long id);

    void delete(long id);

}
