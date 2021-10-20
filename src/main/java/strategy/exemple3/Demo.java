package strategy.exemple3;

import strategy.exemple3.context.Chevalier;
import strategy.exemple3.context.Personnage;
import strategy.exemple3.context.Troll;
import strategy.exemple3.strategies.ComportementArcEtFleches;
import strategy.exemple3.strategies.ComportementHache;
import strategy.exemple3.strategies.ComportementPoignard;

public class Demo {
    public static void main(String[] args) {
        Personnage personnage=new Chevalier();
        personnage.setArme(new ComportementHache());
        personnage.combattre();
        personnage.setArme(new ComportementPoignard());
        personnage.combattre();
        personnage=new Troll();
        personnage.setArme(new ComportementArcEtFleches());
        personnage.combattre();
    }
}
