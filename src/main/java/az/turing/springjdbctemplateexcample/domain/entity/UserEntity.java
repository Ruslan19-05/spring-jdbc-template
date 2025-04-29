package az.turing.springjdbctemplateexcample.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    private Long id;
    private  String name;
    private String email;
    private String group;

    public UserEntity(String name, String email, String group) {
        this.name = name;
        this.email = email;
        this.group = group;
    }
}
