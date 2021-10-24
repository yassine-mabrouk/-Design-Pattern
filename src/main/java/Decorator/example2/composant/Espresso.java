package Decorator.example2.composant;

public class Espresso extends Boissan{
    @Override
    public double cout() {
        return 10;
    }
    public Espresso (){
        super.description="Espresso";
    }
}
