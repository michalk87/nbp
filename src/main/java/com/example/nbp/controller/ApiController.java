package com.example.nbp.controller;

import com.example.nbp.model.Currency;
import com.example.nbp.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*

RestController adnotacja robi to, ze:
@Controller
oraz do każdej metody = akcji Kontrolera
dorzuca @ResponseBody

 */

@RequestMapping("/api")
@RestController
public class ApiController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/exchangerates/{code}")
    public Currency index(@PathVariable String code){
        return currencyService.getCurrency(code);

    }

}
