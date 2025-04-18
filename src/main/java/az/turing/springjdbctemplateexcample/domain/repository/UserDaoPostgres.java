package az.turing.springjdbctemplateexcample.domain.repository;

import az.turing.springjdbctemplateexcample.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserDaoPostgres implements UserPostgresRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public User create(User user) {
        jdbcTemplate.update(UserQuery.query, user.getName(), user.getEmail(), user.getGroup());
        return user;
    }

    @Override
    public List<User> getAll() {
        String query = "select * from user";
        return jdbcTemplate.query(query, new UserRowMapper());
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }


}
