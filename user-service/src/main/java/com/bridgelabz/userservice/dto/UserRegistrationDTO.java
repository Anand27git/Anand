package com.bridgelabz.userservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDTO {
    private int id;

    @NotEmpty(message = "First Name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "First Name Invalid")
    private String firstName;

    @NotEmpty(message = "Last Name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Last Name Invalid")
    private String lastName;

    @NotEmpty(message = "KYC cannot be null")
    @Pattern(regexp = "^[2-9]{1}[0-9]{11}$", message = "KYC Invalid")
    private String kyc;

    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "Date of Birth should not be Empty")
    @Past(message = "Date of Birth should be past date")
    private LocalDate dateOfBirth;

    @NotEmpty(message = "Password cannot be null")
    @Pattern(regexp = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = "Password Invalid")
    private String password;

    @Column(unique=true)
    @NotNull(message = "Email should not be Empty")
    @Email(message = "Email invalid")
    private String email;


}
