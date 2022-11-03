package com.userClient.service;

import com.userClient.domain.User;
import com.userClient.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserClientImpl implements UserClient
{
    @Value("${api.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> users()
    {
        return restTemplate.getForObject(url, UserData.class).getData();
    }


}
