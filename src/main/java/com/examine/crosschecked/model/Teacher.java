package com.examine.crosschecked.model;

import lombok.*;

import javax.persistence.Entity;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Teacher extends Basal{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
