package strategy.exemple2;

import strategy.exemple2.context.Context;
import strategy.exemple2.stategies.Istrategy;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        Context context=new Context();
        context.appliquerStrategy();
        while (true){
            System.out.print("Strategy Name :");
            String strategyClassName=scanner.nextLine();
            Istrategy strategy=(Istrategy)Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            context.appliquerStrategy();
        }
    }

}
