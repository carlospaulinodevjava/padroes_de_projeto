package br.com.useacabeca.strategy;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>"); // << Silêncio >> [16]
    }
}
