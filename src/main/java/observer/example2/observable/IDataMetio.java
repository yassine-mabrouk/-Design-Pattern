package observer.example2.observable;

import observer.example2.observers.Oberver;

public interface IDataMetio {
  void   addObserver(Oberver observer);
    void   deleteObserver(Oberver observer);
    void   notifay();
}
