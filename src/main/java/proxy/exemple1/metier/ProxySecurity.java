package proxy.exemple1.metier;

/*
* Le proxy joue le role d'un cache
*
* */
public class ProxySecurity implements Imetier {
     Proxy proxy=new Proxy();
     private  String key;

    public ProxySecurity(String key) {
        this.key = key;
    }

    @Override
    public double calcul(int n) {
        if(key.equals("1234")){
           return  proxy.calcul(n);
        }
        else {
            throw new RuntimeException("not authorized");
        }

    }
}
