package Decorator.example2.decorators;

import Decorator.example2.composant.Boissan;

public class Chocolat extends AbstractDecorator {
    public Chocolat(Boissan boissan) {
        super(boissan);
    }

    @Override
    public double cout() {
        return super.boissan.cout()+1.5;
    }

    @Override
    public String getDescription() {
        return super.boissan.getDescription()+" au chocolat";
    }
}
