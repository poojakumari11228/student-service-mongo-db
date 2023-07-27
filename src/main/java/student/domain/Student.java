package student.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Student {

    @Id
    private long id;
    private String name;
    private String phoneNumber;
    private String email;
    private Address address;


}
