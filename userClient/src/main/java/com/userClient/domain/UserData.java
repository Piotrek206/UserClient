package com.userClient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserData {
    @JsonProperty("results")
    List<User> data;
}
