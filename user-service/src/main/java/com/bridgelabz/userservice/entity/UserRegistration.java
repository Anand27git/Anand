package com.bridgelabz.userservice.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;
    private String kyc;
    private LocalDate dateOfBirth;
    private String password;
    private String email;

    @CreationTimestamp
    private LocalDate registrationDate;

    @UpdateTimestamp
    private LocalDate updatedDate;
}
