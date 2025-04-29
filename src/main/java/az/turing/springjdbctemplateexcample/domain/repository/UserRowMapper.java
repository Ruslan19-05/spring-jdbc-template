package az.turing.springjdbctemplateexcample.domain.repository;

import az.turing.springjdbctemplateexcample.domain.entity.UserEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper <UserEntity>{

    @Override
    public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return UserEntity.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .email(rs.getString("email"))
                .group(rs.getString("group_name"))
                .build();
    }
}

