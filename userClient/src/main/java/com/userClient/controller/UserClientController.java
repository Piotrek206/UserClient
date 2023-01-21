package com.userClient.controller;

import com.userClient.domain.User;
import com.userClient.service.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserClientController
{
    private final UserClient userClient;

    @GetMapping("/")
    public List<User> users() {
        return userClient.users();
    }
}
