package com.bridgelabz.userservice.controller;

import com.bridgelabz.userservice.dto.ResponseDTO;
import com.bridgelabz.userservice.dto.UserRegistrationDTO;
import com.bridgelabz.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/userservice")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping()
  public ResponseEntity<ResponseDTO> userRegistration(@Valid @RequestBody UserRegistrationDTO userRegistrationDTO) {
    ResponseDTO responseDTO = new ResponseDTO("User Registered successfully",userService.registerUser(userRegistrationDTO));
    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
  }
}
