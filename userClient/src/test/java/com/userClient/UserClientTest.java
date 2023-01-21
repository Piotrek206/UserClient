package com.userClient;

import com.fasterxml.jackson.databind.JsonNode;
import com.userClient.domain.User;
import com.userClient.domain.UserData;
import com.userClient.service.UserClient;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class UserClientTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private UserClient userClient;

    private final String URL = "https://randomuser.me/api";

    private final RestTemplate restTemplate = new RestTemplate();

    WebTestClient webTestClient;

    @BeforeEach
    public void setUp()
    {
        webTestClient = WebTestClient.bindToApplicationContext(applicationContext).build();
    }

    @Test
    public void connectionTest()
    {
        ResponseEntity<JsonNode> response = restTemplate.getForEntity(URL, JsonNode.class);

        HttpStatusCode statusCode = response.getStatusCode();

        assertEquals(statusCode, HttpStatus.OK);
    }

    @Test
    public void contentTypeChecker() {
        ResponseEntity<JsonNode> response = restTemplate.getForEntity(URL, JsonNode.class);

        MediaType contentType = response.getHeaders().getContentType();

        assert contentType != null;
        assertEquals(contentType.getType(), MediaType.APPLICATION_JSON.getType());
    }

    @Test
    public void getAtLeastOneUserTest() {
        UserData response = restTemplate.getForObject(URL, UserData.class);

        assertNotNull(response);

        assertFalse(response.getData().isEmpty());
    }

    @Test
    public void getTenUsersWithFemaleGenderTest() {
        UserData response = restTemplate.getForObject(URL + "/?results=10&gender=female", UserData.class);

        assert response != null;
        for (User user : response.getData()) {
            assertEquals(user.getGender(), "female");
        }
    }

    @Test
    public void getUsersTest() {
        createRequest();
    }

    private void createRequest() {
        JsonNode jsonNode = null;
        jsonNode = restTemplate.getForObject(URL, JsonNode.class);

        assert jsonNode != null;
        System.out.println("Response : " + jsonNode);
    }
}