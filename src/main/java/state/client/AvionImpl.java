package state.client;

import lombok.Data;
import state.states.EtatAuPiste;
import state.states.State;
@Data
public class AvionImpl implements IAvion {
       protected  State state;

    public AvionImpl() {
        this.state = new EtatAuPiste(this); // etat initial
    }

    @Override
    public void sortirDuGarage() {
         state.executeSortirDuGarage();
    }

    @Override
    public void entererAuGarage() {
             state.executeEntererAuGarage();
    }

    @Override
    public void atterir() {
          state.executeAtterir();
    }

    @Override
    public void decoller() {
            state.executeDecoller();
    }

    @Override
    public void doActivity() {
          state.executeDoActivity();
    }
}
