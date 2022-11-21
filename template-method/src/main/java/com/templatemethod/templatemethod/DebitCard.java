package com.templatemethod.templatemethod;

public class DebitCard extends Payment{
    public DebitCard(Float value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Float calculateTax() {
        return value * 0.02F;
    }
}
