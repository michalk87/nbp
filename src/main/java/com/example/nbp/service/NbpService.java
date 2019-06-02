package com.example.nbp.service;


import com.example.nbp.model.Currency;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NbpService implements CurrencyService{
    @Override
    public Currency getCurrency(String currency) {
        String apiPath = "http://api.nbp.pl/api/exchangerates/rates/c/" + currency + "?format=json";
        System.out.println("URK"+apiPath);
        return new RestTemplate().getForObject(apiPath, Currency.class);
    }
}
