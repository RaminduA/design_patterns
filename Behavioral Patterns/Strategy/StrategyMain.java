public class StrategyMain {
    public static void main(String[] args) {
        StrategyContext contextA = new StrategyContextA();
        StrategyContext contextB = new StrategyContextB();
        contextA.execute();
        contextB.execute();
    }
}
