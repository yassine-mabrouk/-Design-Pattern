package strategy.exemple3.strategies;

public class ComportementPoignard implements IComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Combattre avec Poignard");
    }
}
