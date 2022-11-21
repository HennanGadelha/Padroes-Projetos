package com.templatemethod.templatemethod;

abstract public class Payment {

    protected Float value;
    protected Gateway gateway;

    public Payment(Float value, Gateway gateway){
        this.value = value;
        this.gateway = gateway;
    }

    abstract public  Float calculateTax();

    public void collectValue(){
        this.gateway.cobrar(this.value + this.calculateTax());
    }


}
