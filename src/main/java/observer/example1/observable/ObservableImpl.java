package observer.example1.observable;

import lombok.Data;
import observer.example1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    public int etat ;
    public List<Observer>  observers=new ArrayList<Observer>();
    @Override
    public void subscribe(Observer observer) {
        System.out.println(" Observe is added successfully ");
         observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        System.out.println(" Observe is removed  successfully ");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs :this.observers) {
            obs.update(this);
        }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
