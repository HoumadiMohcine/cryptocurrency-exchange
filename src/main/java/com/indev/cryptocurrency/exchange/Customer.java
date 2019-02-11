package com.indev.cryptocurrency.exchange;

public class Customer {
    private int solde ;
    private String currencyType ;
    private int balance ;
    private String customerType = "";


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
        String str = "" ;
        if(currencyType == null && solde == 0){
            return balance + ":$" ;
        }
        return balance + ":$" + "," + solde + ":" + currencyType ;
    }

    public Customer withBalance(int i) {
        this.balance = i ;
        //customer.account.setBalance(i);
        //System.out.print(customer.account.toString());
        //this.account.setBalance(i);
        return this ;
    }

    public int getSolde() {
        return solde;
    }

    public boolean isSeller(){
        return this.customerType.equals("seller") ;
    }

    public void setCustomerAsSeller() {
        this.customerType ="seller" ;
    }
}
