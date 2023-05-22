public class InfiniteLoop implements Loop {
    private LoopStrategy strategy;
    private boolean stopped = false;

    public InfiniteLoop() {
        // Constructor público
    }

    public void setStrategy(LoopStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        if (strategy != null) {
            strategy.execute();
        }
    }

    @Override
    public void start() {
        stopped = false;
        while (!stopped) {
            executeStrategy();
        }
    }

    @Override
    public void stop() {
        stopped = true;
    }
}
