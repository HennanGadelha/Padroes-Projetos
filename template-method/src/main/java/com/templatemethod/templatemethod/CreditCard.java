package com.templatemethod.templatemethod;

public class CreditCard extends Payment{

    public CreditCard(Float value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Float calculateTax() {

        if(this.value > 1000F) return  value * 0.3F;

        return this.value * 0.05F;
    }


}
