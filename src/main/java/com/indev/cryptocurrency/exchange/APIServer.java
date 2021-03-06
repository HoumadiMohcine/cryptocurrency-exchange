package com.indev.cryptocurrency.exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@SpringBootApplication
@SpringBootConfiguration
public class APIServer {

    public static void main(String[] args) {
        SpringApplication.run(APIServer.class, args);
    }

}

@RestController
class CustomerController {
    @Autowired
    CryptocurrencyBank bank ;
    @GetMapping
    public List<String> getAll() {


        return bank.currency;
    }

    @PostMapping
    public List<String> addCurrency(@RequestParam String name) {
        bank.addSupportedCryptoCurrency(name);
        return bank.getSupportedCryptoCurrency();
    }
    @DeleteMapping
    public List<String> removeCurrency() {

        bank.removeSupportedCurrency();
        return bank.getSupportedCryptoCurrency();
    }
}
