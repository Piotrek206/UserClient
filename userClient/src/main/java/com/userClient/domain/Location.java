package com.userClient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {
    @JsonProperty("city")
    private String city;
}
