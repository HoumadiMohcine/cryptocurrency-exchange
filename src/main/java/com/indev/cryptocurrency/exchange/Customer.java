package com.indev.cryptocurrency.exchange;


import java.util.Currency;

public class Customer {
    int solde ;
    String currencyType ;
    int balance ;
    String customerType = "";




    public Customer(int solde , String type){
        this.solde = solde ;
        this.currencyType = type ;
        balance = 0 ;

    }

    public Customer(){

    }

    public Customer(String type ){
        currencyType = type ;
    }


    public Customer withCryptocurrency(String bitcoin, int i) {
        this.currencyType = bitcoin ;
        this.solde = i ;
        return this;
    }

    @Override
    public String toString() {
        if(currencyType == null && solde == 0){
            return balance + ":$" ;
        }
        return balance + ":$" + "," + solde + ":" + currencyType ;
    }

    public Customer withBalance(int i) {
        this.balance = i ;
        return this ;
    }

    public int getBoughtQuantity(int quantity , int number , String currencyType) {

        if(quantity <= solde && currencyType.equals(this.currencyType) ){

            this.solde -= quantity ;
            this.balance += quantity ;
            return quantity;
        }

        return 0 ;
    }

    public boolean isSeller(){
        return this.customerType.equals("seller") ;
    }

    public void setCustomerAsSeller() {
        this.customerType ="seller" ;
    }


    public void updateCustomerSolde(int solde , int number ,String bitcoin){
        this.solde += solde ;
        this.balance += solde ;
        this.currencyType = bitcoin ;
    }
}
