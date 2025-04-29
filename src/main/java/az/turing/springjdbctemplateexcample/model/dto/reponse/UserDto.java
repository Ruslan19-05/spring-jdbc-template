package az.turing.springjdbctemplateexcample.model.dto.reponse;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {

    private String name;
    private String group;
}
