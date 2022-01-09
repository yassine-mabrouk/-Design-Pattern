package proxy.exemple1.metier;

public class ImetierImpl implements Imetier {
    @Override
    public double calcul(int n) {
        return n*n;
    }
}
