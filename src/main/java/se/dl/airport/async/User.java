package se.dl.airport.async;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private String firstName;
    private String lastName;
    private String email;
}