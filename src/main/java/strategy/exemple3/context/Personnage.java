package strategy.exemple3.context;

import lombok.Data;
import strategy.exemple3.strategies.IComportementArme;

import javax.swing.text.html.HTMLDocument;

@Data
public class Personnage {
    public IComportementArme arme ;
    public void combattre(){
        this.arme.utiliserArme();
    }
}
