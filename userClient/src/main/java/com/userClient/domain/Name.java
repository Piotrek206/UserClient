package com.userClient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Name {
    @JsonProperty("first")
    private String firstName;

    @JsonProperty("last")
    private String lastName;
}
