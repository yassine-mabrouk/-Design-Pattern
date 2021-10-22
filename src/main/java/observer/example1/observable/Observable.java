package observer.example1.observable;

import observer.example1.observer.Observer;

public interface Observable {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();
}
