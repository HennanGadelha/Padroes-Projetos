package com.templatemethod.templatemethod;

public class Program {

    public static void main(String[] args) {

        Gateway gateway = new Gateway();

        CreditCard paymentCreditCard = new CreditCard(50F, gateway);
        paymentCreditCard.collectValue();

        DebitCard paymentDebitCard = new DebitCard(50F, gateway);
        paymentDebitCard.collectValue();

        Pix paymentPix = new Pix(50F, gateway);
        paymentPix.collectValue();

    }
}
