package br.com.useacabeca.strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // Inicializa os comportamentos específicos para um MallardDuck no construtor [23]
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck"); // Eu sou um pato-real de verdade [23]
    }
}
