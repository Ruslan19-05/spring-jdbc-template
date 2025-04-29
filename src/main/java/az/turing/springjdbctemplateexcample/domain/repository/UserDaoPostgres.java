package az.turing.springjdbctemplateexcample.domain.repository;

import az.turing.springjdbctemplateexcample.domain.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import static az.turing.springjdbctemplateexcample.domain.repository.UserQuery.query;

@RequiredArgsConstructor
@Repository
public class UserDaoPostgres implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public UserEntity save(UserEntity user) {
        jdbcTemplate.update(query, user.getName(), user.getEmail(), user.getGroup());
        return user;
    }

    @Override
    public List<UserEntity> getAll() {
        return jdbcTemplate.query(UserQuery.query2, new UserRowMapper());
    }

    @Override
    public UserEntity findById(long id) {
        return jdbcTemplate.queryForObject(UserQuery.query3,new UserRowMapper());
    }

    @Override
    public void delete(long id) {
        jdbcTemplate.update(UserQuery.query4,id);
    }


}
