package Decorator.example2.decorators;

import Decorator.example2.composant.Boissan;

public class Vanille extends AbstractDecorator {
    public Vanille(Boissan boissan) {
        super(boissan);
    }

    @Override
    public double cout() {
        return super.boissan.cout()+2.5;
    }

    @Override
    public String getDescription() {
        return super.boissan.getDescription()+" Avec vanille";
    }
}
