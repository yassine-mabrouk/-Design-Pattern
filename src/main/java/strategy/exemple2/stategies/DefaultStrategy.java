package strategy.exemple2.stategies;

public class DefaultStrategy implements Istrategy{
    @Override
    public void appliquer() {
        System.out.println("Appliquer default strategy ");
    }
}
