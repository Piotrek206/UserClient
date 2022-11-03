package com.userClient;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
//@ContextConfiguration
//@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@WebMvcTest
public class UserClientControllerTest {

    @Autowired
    MockMvc mockMvc;

    private final String URL = "http://localhost:8080/";

    @Test
    public void connectionTest() throws Exception
    {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get(URL));
        resultActions.andExpect(status().isOk());
    }

//    @Autowired
//    ApplicationContext applicationContext;
//
//    WebTestClient webTestClient;
//
//    @Before
//    public void setUp() throws Exception
//    {
//        webTestClient = WebTestClient.bindToApplicationContext(applicationContext).build();
//    }
//
//    @Test
//    public void index() throws Exception
//    {
//        webTestClient.get().uri("/")
//                .exchange()
//                .expectStatus().isOk();
//    }
}
