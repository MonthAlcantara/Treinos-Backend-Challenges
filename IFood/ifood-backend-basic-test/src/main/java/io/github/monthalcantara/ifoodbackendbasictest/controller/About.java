package io.github.monthalcantara.ifoodbackendbasictest.controller;

import io.github.monthalcantara.ifoodbackendbasictest.adapter.OpenWeatherClient;
import io.github.monthalcantara.ifoodbackendbasictest.dto.WheaterWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class About {

    @Value("${client.appid.wheater}")
    private String appId;

    private OpenWeatherClient openWeatherClient;

    public About(OpenWeatherClient openWeatherClient) {
        this.openWeatherClient = openWeatherClient;
    }

    @GetMapping("/about")
    public String aboutHealth(){
        return "O serviço está no ar";
    }

    @GetMapping("/weather")
    public ResponseEntity aboutWeather(@RequestParam("city") String city){
        WheaterWrapper wheaterWrapper = openWeatherClient.teste(city, appId);
        return ResponseEntity.ok(wheaterWrapper);
    }
}
