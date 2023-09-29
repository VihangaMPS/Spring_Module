package lk.ijse.spring.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;
}
