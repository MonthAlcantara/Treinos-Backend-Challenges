package io.github.monthalcantara.ifoodbackendbasictest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class InfoPrincipalDTO {

    @JsonProperty(value = "temp")
    private String temp;

    @JsonProperty(value = "feels_like")
    private String feelsLike;

    @JsonProperty(value = "temp_min")
    private String tempMin;

    @JsonProperty(value = "temp_max")
    private String tempMax;

    @JsonProperty(value = "pressure")
    private String pressure;

    @JsonProperty(value = "humidity")
    private String humidity;


}
