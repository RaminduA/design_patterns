public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.execute();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
