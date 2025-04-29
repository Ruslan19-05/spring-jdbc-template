package az.turing.springjdbctemplateexcample.domain.repository;

public class UserQuery {

    public static final String query="insert into users(name,email,group_name) values(?,?,?)";
    public static final String query2="select * from users ?";
    public static final String query3="select * from users where id=?";
    public static final String query4="delete from users where email=?";
}
