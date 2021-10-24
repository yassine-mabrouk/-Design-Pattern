package Decorator.example2.decorators;

import Decorator.example2.composant.Boissan;

public abstract class AbstractDecorator extends Boissan {

    protected Boissan boissan;
    public AbstractDecorator( Boissan boissan){
          this.boissan=boissan;
    }
    public abstract String getDescription();
}
