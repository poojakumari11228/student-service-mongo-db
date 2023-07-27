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
public class Address {

    @Id
    private long id;
    private String street;
    private String city;
    private String zip;
}
