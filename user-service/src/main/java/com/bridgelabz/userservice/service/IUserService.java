package com.bridgelabz.userservice.service;

import com.bridgelabz.userservice.dto.UserRegistrationDTO;

public interface IUserService {
    UserRegistrationDTO registerUser(UserRegistrationDTO userRegistrationDTO);

}
