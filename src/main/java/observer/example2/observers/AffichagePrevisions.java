package observer.example2.observers;

import observer.example2.observable.IDataMetio;

public class AffichagePrevisions implements Oberver ,Affichage{
    double max =0;
    @Override
    public void afficher() {
        System.out.println("==============affichage previsions===========");
    }

    @Override
    public void actualiser(IDataMetio dataMetio) {
    this.afficher();

    }
}
