package com.springboot.sns.controller.response;

import com.springboot.sns.model.User;
import com.springboot.sns.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserLoginResponse {
    private String token;
}
