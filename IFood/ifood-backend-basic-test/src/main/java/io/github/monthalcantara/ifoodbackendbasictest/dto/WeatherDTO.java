package io.github.monthalcantara.ifoodbackendbasictest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WeatherDTO {

    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "main")
    private String main;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "icon")
    private String icon;
}
