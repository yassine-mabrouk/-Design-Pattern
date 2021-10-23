package observer.example2.observers;

import observer.example2.observable.DataMetio;
import observer.example2.observable.IDataMetio;

public class AffichageConditions implements Oberver ,Affichage{
    @Override
    public void afficher() {
        System.out.println("======affichage conditions===========");
    }
    @Override
    public void actualiser(IDataMetio dataMetio) {
    this.afficher();
        System.out.println("Pressure    :"+ ((DataMetio) dataMetio).getPressure());
        System.out.println("Humidity    :"+ ((DataMetio) dataMetio).getHumidity());
        System.out.println("Temperature :"+ ((DataMetio) dataMetio).getTemperature());
    }
}
