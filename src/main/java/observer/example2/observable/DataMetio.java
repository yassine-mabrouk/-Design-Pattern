package observer.example2.observable;

import lombok.Data;
import observer.example1.observer.Observer;
import observer.example2.observers.Oberver;

import java.util.ArrayList;
import java.util.List;

@Data
public class DataMetio implements IDataMetio{
    private List<Oberver> observers=new ArrayList<>();
    private double temperature;
    private double pressure;
    private double humidity;
    @Override
    public void addObserver(Oberver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Oberver observer) {
     this.observers.remove(observer);
    }

    @Override
    public void notifay() {
        for (Oberver observer : observers) {
            observer.actualiser(this);
        }
    }
    public  void setMesure(double temperature ,double pressure , double humidity){
        this.humidity=humidity;
        this.pressure=pressure;
        this.temperature =temperature;
        notifay();
    }
}
