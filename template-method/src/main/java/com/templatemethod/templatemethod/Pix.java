package com.templatemethod.templatemethod;

public class Pix extends Payment{
    public Pix(Float value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Float calculateTax() {
        return 0.F;
    }
}
