package se.dl.airport.domain;

import lombok.Data;

@Data
public class User {
    private String email;
    private String name;
    private String address;
}