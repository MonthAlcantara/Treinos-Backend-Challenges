package io.github.monthalcantara.ifoodbackendbasictest.adapter;

import io.github.monthalcantara.ifoodbackendbasictest.dto.WheaterWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openweathermap", url = "${client.url.wheater}")
public interface OpenWeatherClient {

    @GetMapping("/weather")
    WheaterWrapper teste(@RequestParam("q") String city, @RequestParam("appId") String appId);
}
