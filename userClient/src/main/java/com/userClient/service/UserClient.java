package com.userClient.service;

import com.userClient.domain.User;
import com.userClient.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class UserClient {
    @Value("${api.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    public List<User> users()
    {
        return Objects.requireNonNull(restTemplate.getForObject(url, UserData.class)).getData();
    }
}
