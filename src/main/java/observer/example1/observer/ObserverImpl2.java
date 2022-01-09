package observer.example1.observer;

import observer.example1.observable.Observable;
import observer.example1.observable.ObservableImpl;

public class ObserverImpl2 implements Observer {

    @Override
    public void update(Observable obs) {
        System.out.println("Execution observer 2 :");
        System.out.println("nombre  des observers "+((ObservableImpl)obs).observers.size());
    }
}
