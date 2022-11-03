package com.userClient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("name")
    private Name name;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("login")
    private Login login;

    @JsonProperty("registered")
    private RegistrationInfo registrationInfo;
}
