package br.com.useacabeca.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        // Cria um MallardDuck
        Duck mallard = new MallardDuck();
        // PerformQuack delega para o objeto Quack, que imprime "Quack" [24]
        mallard.performQuack();
        // PerformFly delega para o objeto FlyWithWings, que imprime "I'm flying!!" [24]
        mallard.performFly();

        System.out.println(); // Apenas para espaçamento na saída

        // Cria um ModelDuck
        Duck model = new ModelDuck();
        // Inicialmente, performFly delega para FlyNoWay, que imprime "I can't fly" [25]
        model.performFly();

        // Altera o comportamento de voo do ModelDuck em tempo de execução [25]
        // Agora, o ModelDuck terá o comportamento FlyRocketPowered
        model.setFlyBehavior(new FlyRocketPowered());
        // performFly agora delega para o novo objeto FlyRocketPowered, que imprime "I'm flying with a rocket!" [26]
        model.performFly();
    }
}
