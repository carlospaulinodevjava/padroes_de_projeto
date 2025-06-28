package br.com.useacabeca.strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly"); // Eu não posso voar [15]
    }
}
