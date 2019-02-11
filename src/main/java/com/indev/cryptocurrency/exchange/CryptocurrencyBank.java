package com.indev.cryptocurrency.exchange;

import java.util.ArrayList;
import java.util.List;

public class CryptocurrencyBank {

    List<Customer> customers = new ArrayList() ;

    public void addSupportedCryptoCurrency(String bitcoin) {
       customers.add(new Customer()) ;
    }

    public int requestTransaction(Customer buyerCustomer, int i, String bitcoin) {

        for (Customer customer : customers){
            if (customer.isSeller()){
                buyerCustomer.updateCustomerSolde(i , bitcoin);
                return customer.getBoughtQuantity(i , buyerCustomer , bitcoin);
            }
        }


        return 0;
    }

    public void addSeller(Customer sellerCustomer) {
        sellerCustomer.setCustomerAsSeller() ;
        this.customers.add(sellerCustomer) ;

    }
}
