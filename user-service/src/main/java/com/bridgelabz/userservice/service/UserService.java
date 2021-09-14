package com.bridgelabz.userservice.service;

import com.bridgelabz.userservice.builder.UserServiceBuilder;
import com.bridgelabz.userservice.dto.UserRegistrationDTO;
import com.bridgelabz.userservice.entity.UserRegistration;
import com.bridgelabz.userservice.repository.UserServiceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService{

@Autowired
private UserServiceRespository userServiceRespository;
@Autowired
private UserServiceBuilder userServiceBuilder;
@Autowired
private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public UserRegistrationDTO registerUser(UserRegistrationDTO userRegistrationDTO) {
        Optional<UserRegistration> emailId = userServiceRespository.findByEmail(userRegistrationDTO.getEmail());
        String password = bCryptPasswordEncoder.encode(userRegistrationDTO.getPassword());
        userRegistrationDTO.setPassword(password);
        UserRegistration userRegistrationDO = userServiceBuilder.buildDO(userRegistrationDTO);
        userRegistrationDO = userServiceRespository.save(userRegistrationDO);
        userRegistrationDTO.setId(userRegistrationDO.getId());
        return userRegistrationDTO;
    }
}
