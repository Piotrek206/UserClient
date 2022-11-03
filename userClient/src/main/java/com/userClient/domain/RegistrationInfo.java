package com.userClient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegistrationInfo {

    @JsonProperty("date")
    private LocalDateTime registrationDate;
}
