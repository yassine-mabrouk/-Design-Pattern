package observer.example1;

import observer.example1.observable.Observable;
import observer.example1.observable.ObservableImpl;
import observer.example1.observer.Observer;
import observer.example1.observer.ObserverImpl1;
import observer.example1.observer.ObserverImpl2;

public class Demo {
    public static void main(String[] args) {
        ObservableImpl observer=new ObservableImpl();
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();
        observer.subscribe(observer1);
        observer.subscribe(observer2);
        observer.setEtat(10);
        observer.setEtat(20);
        // add anonymous observers
        observer.subscribe(new Observer() {
            @Override
            public void update(Observable obs) {
                System.out.println("anonymous observer 3 ");
            }
        });
        //with expression Lambda
        observer.subscribe((ons)->{
            System.out.println("anonymous observer 4 ");
        });
        observer.setEtat(20);

    }
}
