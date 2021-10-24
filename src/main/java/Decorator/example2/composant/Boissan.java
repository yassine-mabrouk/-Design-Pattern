package Decorator.example2.composant;

import lombok.Data;


public abstract class Boissan {
    protected  String description ;
    public  abstract double cout ();

    public String getDescription() {
        return description;
    }
}
