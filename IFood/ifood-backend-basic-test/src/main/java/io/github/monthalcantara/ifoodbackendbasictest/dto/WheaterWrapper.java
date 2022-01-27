package io.github.monthalcantara.ifoodbackendbasictest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class WheaterWrapper {

    @JsonProperty(value = "weather")
    private List<WeatherDTO> wheaters;

    @JsonProperty(value = "main")
    private InfoPrincipalDTO main;

    @JsonProperty(value = "timezone")
    private String timezone;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "cod")
    private String cod;
}
