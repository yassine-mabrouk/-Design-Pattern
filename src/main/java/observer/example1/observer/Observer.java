package observer.example1.observer;

import observer.example1.observable.Observable;

public interface Observer {
    void update (Observable obs);
}
