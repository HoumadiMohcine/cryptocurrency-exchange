package com.indev.cryptocurrency.exchange;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CryptocurrencyBank {

    List<Customer> customers = new ArrayList() ;
    List<String> currency = new ArrayList<>() ;
    public void addSupportedCryptoCurrency(String bitcoin) {
       /*customers.add(new Customer()) ;
       currency.put(bitcoin , 1) ;*/
       currency.add(bitcoin) ;

    }

    public int requestTransaction(Customer buyerCustomer, int i, String bitcoin) {

        /*for (Customer customer : customers){
            if (customer.isSeller() && customer.currencyType.equals(bitcoin)){
                buyerCustomer.updateCustomerSolde(i , currency.get(bitcoin),  bitcoin);
                currency.replace(bitcoin , currency.get(bitcoin) + i ) ;
                return customer.getBoughtQuantity(i , currency.get(bitcoin) ,bitcoin);
            }
        }*/


        return 0;
    }

    public void addSeller(Customer sellerCustomer) {
        sellerCustomer.setCustomerAsSeller() ;
        this.customers.add(sellerCustomer) ;

    }

    public List<String> getSupportedCryptoCurrency() {
        return currency ;
    }

    public void removeSupportedCurrency() {
            currency.remove(0) ;
    }
}
