package br.com.useacabeca.strategy;


public class ModelDuck extends Duck {
    public ModelDuck() {
        // Inicialmente, um pato modelo não voa [18]
        flyBehavior = new FlyNoWay();
        // E grasna como um pato comum (comportamento padrão) [18]
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck"); // Eu sou um pato modelo [18]
    }
}

