package observer.example1.observer;

import observer.example1.observable.Observable;
import observer.example1.observable.ObservableImpl;

public class ObserverImpl1 implements Observer {
    int somme =0;
    @Override
    public void update(Observable obs) {
        somme+=((ObservableImpl)obs).getEtat();
        System.out.println("Execution observer 1 :");
        System.out.println("la somme est etat :"+somme);
    }
}
