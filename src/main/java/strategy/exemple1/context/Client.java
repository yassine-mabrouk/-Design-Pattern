package strategy.exemple1.context;

import lombok.Data;
import lombok.NoArgsConstructor;
import strategy.exemple1.strategies.ITri;
@Data
@NoArgsConstructor
public class Client {
    ITri tri ;

    public Client(ITri tri) {
        this.tri = tri;
    }

    public ITri getTri() {
        return tri;
    }

    public void setTri(ITri tri) {
        this.tri = tri;
    }

    public  void trier(){
        this.tri.trier();
    }
}
