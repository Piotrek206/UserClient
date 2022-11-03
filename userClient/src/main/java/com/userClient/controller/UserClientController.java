package com.userClient.controller;

import com.userClient.domain.User;
import com.userClient.service.UserClientImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserClientController
{
    private final UserClientImpl userClient;

    @GetMapping("/")
    public List<User> users() {
        return userClient.users();
    }
}
