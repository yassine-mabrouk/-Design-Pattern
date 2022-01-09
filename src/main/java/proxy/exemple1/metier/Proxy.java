package proxy.exemple1.metier;

import java.util.HashMap;
import java.util.Map;

/*
* Le proxy joue le role d'un cache
*
* */
public class Proxy implements Imetier {
    Imetier metier=new ImetierImpl();
    Map<Integer,Double> cache=new HashMap<>();
    @Override
    public double calcul(int n) {
        Double res =cache.get(n);
        if (res!=null) {
            System.out.println("========from cache ==============");
            return res;
        }
        else {
            System.out.println("========from Metier  ==============");
            double result= metier.calcul(n);
            cache.put(n,result);
            return result;
        }

    }
}
