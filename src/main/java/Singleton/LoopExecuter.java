package Singleton;
import Decorator.Reverser;
import Strategy.Loop;
import Strategy.LoopStrategy;
import Strategy.LoopStrategyImp1;
import Strategy.LoopStrategyImp2;
import Decorator.InfiniteLoop;
import Decorator.Reverser;


public class LoopExecuter {
    private LoopStrategy strategy;

    public LoopExecuter() {
        // Constructor público
    }

    public void setStrategy(LoopStrategy strategy) {
        this.strategy = strategy;
    }


        public static void executeLoop() {
            InfiniteLoop loop = new InfiniteLoop();
            LoopStrategy strategy1 = new LoopStrategyImp1();
            LoopStrategy strategy2 = new LoopStrategyImp2();

            loop.setStrategy(strategy1);
            loop.start();


            // Detener el bucle después de un tiempo
            try {
                Thread.sleep(5000); // Esperar 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loop.setStrategy(strategy2);
            loop.stop();
        }
    }


