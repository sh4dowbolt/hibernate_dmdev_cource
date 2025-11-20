package com.suraev.entity;

import com.suraev.converter.BirthDayConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users_test",schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class  User {

    @Id
    private String username;
    private String firstName;
    private String lastName;
    @Column(name = "birth_date")
    @Convert(converter = BirthDayConverter.class)
    private Birthday dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Role role;

}
