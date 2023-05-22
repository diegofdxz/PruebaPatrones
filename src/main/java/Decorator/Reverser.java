package Decorator;

import Decorator.LoopDecorator;
import Strategy.LoopStrategy;

public class Reverser implements LoopDecorator {
    private LoopStrategy strategy;
    private boolean stopped = true;
    public Reverser(LoopStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute() {
        String result = strategy.execute();
        if (result.equals("para")) {
            System.out.println("Ejecutar Bucle");
        } else {

            System.out.println("Terminar Bucle");
        }
    }


    @Override
    public void start() {
        stopped = false;
        System.out.println("Bucle Iniciado");
        while (!stopped) {
            execute();
        }
    }

    @Override
    public void stop() {
        stopped = true;
        System.out.println("Bucle Detenido");

    }
}
