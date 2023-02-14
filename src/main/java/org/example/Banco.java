package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Banco {
    private String name;
    public static int inicialMoney = 1500;


    public int lendMoney(int askMoney){

            if(askMoney>inicialMoney){
                throw new RuntimeException("Fondos Insuficientes");
            }
            inicialMoney -= askMoney;

            return askMoney;
    }

}
