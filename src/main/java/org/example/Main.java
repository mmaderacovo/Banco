package org.example;

public class Main {
    public static void main(String[] args) {

       /*Banco bankItau = new Banco("Itau");
       Usuario juanPablo = new Usuario("Juan Pablo",1098, 0);
       Usuario mariaAngelica = new Usuario("Maria Angelica", 1095,0);

        System.out.println("Dinero Inicial del banco= "+ Banco.inicialMoney);
        System.out.println("Dinero inicial de Juan Pablo= " + juanPablo.getMoney());

        juanPablo.setMoney(bankItau.lendMoney(500));
        System.out.println("Dinero del banco= " + Banco.inicialMoney);
        System.out.println("Dinero de Juan Pablo= " + juanPablo.getMoney());

        mariaAngelica.setMoney(bankItau.lendMoney(5000));
        System.out.println("Dinero de Angelica= "+ mariaAngelica.getMoney());
        System.out.println("Dinero del banco= " + Banco.inicialMoney);

        System.out.println("Nombre del Banco " + bankSantander.getName());
        System.out.println("Dinero disponible = " + bankSantander.getMoney());
        System.out.println("Dinero comun " + Banco.inicialMoney);
        Banco.inicialMoney = 3000;
        System.out.println("Dinero comun " + Banco.inicialMoney);
        System.out.println("Nombre del Banco " + bankItau.getName());
        System.out.println("Dinero disponible = " + bankItau.getMoney());*/

        //Ejemplo override
        Auto renault = new Renault();
        Auto bmw = new Bmw();
        renault.pitar();
        bmw.pitar();

    }
}