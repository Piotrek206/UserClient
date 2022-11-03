package com.userClient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Login {

    @JsonProperty("uuid")
    private String loginUuid;
}
