package strategy.exemple1;

// decription exemple1
/*
*utiliser une fammile des algo pour le tri
* */

import jdk.internal.dynalink.linker.LinkerServices;
import strategy.exemple1.context.Client;
import strategy.exemple1.strategies.TriBulle;
import strategy.exemple1.strategies.TriRappide;

public class Demo {
    public static void main(String[] args) {
        Client c=new Client();
        c.setTri(new TriBulle());
        c.trier();
        System.out.println("changement de strategy ");
        c.setTri(new TriRappide());
        c.trier();
    }
}
