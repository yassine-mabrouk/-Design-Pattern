package strategy.exemple2.context;

import lombok.Data;
import strategy.exemple2.stategies.DefaultStrategy;
import strategy.exemple2.stategies.Istrategy;

@Data
public class Context {
    Istrategy strategy =new DefaultStrategy();
    public void appliquerStrategy(){
        this.strategy.appliquer();
    }
}
