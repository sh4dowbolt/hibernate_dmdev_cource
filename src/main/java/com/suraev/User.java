package com.suraev;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "users_test",schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String username;
    private String firstName;
    private String lastName;
    @Column(name = "birth_date")
    private LocalDate dateOfBirth;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Role role;

}
