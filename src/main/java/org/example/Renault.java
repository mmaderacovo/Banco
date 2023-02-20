package org.example;

public class Renault extends Auto implements PagoAuto{

    @Override
    public void pitar (){
        System.out.println("Pitar desde de renoult");
    }

    @Override
    public void efectivo() {
        System.out.println("pago efectivo");
    }

    @Override
    public void paypal() {
        System.out.println("pago paypal");

    }
}
