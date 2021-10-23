package observer.example2.observers;

import observer.example2.observable.IDataMetio;

public class AffichageStatique implements Oberver , Affichage{
    @Override
    public void afficher() {
        System.out.println("===========affichage statique=============");
    }

    @Override
    public void actualiser(IDataMetio dataMetio) {
           this.afficher();

    }
}
