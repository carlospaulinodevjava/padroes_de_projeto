package br.com.useacabeca.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        // Construtor padrão
    }

    // Método abstrato que subclasses concretas devem implementar para exibir o pato [21]
    public abstract void display();

    public void performFly() {
        // Delega o comportamento de voo para o objeto flyBehavior
        // O Duck não sabe como voar, ele apenas pede ao seu flyBehavior para voar [20]
        flyBehavior.fly();
    }

    public void performQuack() {
        // Delega o comportamento de grasno para o objeto quackBehavior [20]
        quackBehavior.quack();
    }

    // Métodos setters para mudar o comportamento de voo dinamicamente [17]
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    // Métodos setters para mudar o comportamento de grasno dinamicamente [17]
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!"); // Todos os patos flutuam, até mesmo os de isca! [22]
    }
}
