package Decorator.example2;

import Decorator.example2.composant.Boissan;
import Decorator.example2.composant.Deca;
import Decorator.example2.composant.Espresso;
import Decorator.example2.decorators.Chocolat;
import Decorator.example2.decorators.Vanille;

public class Demo {
    public static void main(String[] args) {
        Boissan boissan=new Espresso();
        System.out.println("========================");
        System.out.println("Description: "+boissan.getDescription());
        System.out.println("Montant    : "+boissan.cout());
        // boissaon au chocolat
        boissan=new Chocolat(boissan);
        System.out.println("========================");
        System.out.println("Description: "+boissan.getDescription());
        System.out.println("Montant    : "+boissan.cout());
        // boissaon au chocolat  avec vanille
        boissan=new Vanille(boissan);
        System.out.println("========================");
        System.out.println("Description: "+boissan.getDescription());
        System.out.println("Montant    : "+boissan.cout());
        //........... PROBLEME EST RESOLU AVEC DP DECORATOR

    }
}
