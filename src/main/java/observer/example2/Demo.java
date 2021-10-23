package observer.example2;

/*
* Description :
*
* weather Channel
* Félicitation! Votre société a été retenue pour construire notre station météorologique de dernière génération
consultable en ligne!
La station sera basée sur notre objet DonneesMeteo (brevet en cours),qui enregistre les conditions météorologique
à un moment donné (température, hygrométrie et pression atmosphérique).
Nous aimerions que vous nous créiez une application qui fournira d’abord trois affichages: conditions actuelles,
statistiques et prévisions simples, tous trois mis à jour en temps réel au fur et à mesure que l’objet DonneesMeteo acquiert les
données les plus récentes.
De plus cette station météo doit être extensible. MétéoExpress veut commercialiser une API pour que les autres
développeurs puissent réaliser leurs propres affichages et les insérer directement. Nous souhaitons que vous nous fournissiez
cette API !
*
* */

import observer.example2.observable.DataMetio;
import observer.example2.observers.AffichageConditions;
import observer.example2.observers.AffichagePrevisions;
import observer.example2.observers.AffichageStatique;
import observer.example2.observers.Oberver;

public class Demo {
    public static void main(String[] args) {
        DataMetio dataMetio=new DataMetio();
        Oberver observer1=new AffichageConditions();
        Oberver observer2=new AffichageStatique();
        Oberver observer3=new AffichagePrevisions();
        dataMetio.addObserver(observer1);
        dataMetio.addObserver(observer2);
        dataMetio.addObserver(observer3);
        dataMetio.setMesure(34,120,18);

    }
}
