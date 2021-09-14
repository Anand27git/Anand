package com.bridgelabz.userservice.builder;

import com.bridgelabz.userservice.dto.UserRegistrationDTO;
import com.bridgelabz.userservice.entity.UserRegistration;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserServiceBuilder {


    public UserRegistration buildDO(UserRegistrationDTO userRegistrationDTO) {
        UserRegistration userRegistration = new UserRegistration();
        BeanUtils.copyProperties(userRegistrationDTO, userRegistration);

        return userRegistration;
    }
}
