package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConverterController {

    @Bean
    RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    @GetMapping("/conversionrate")
    public void getConversionRate(){
        RestTemplate restTemplate  = getRestTemplate();
        restTemplate.getForEntity("http://google.com",String.class);
    }
}
