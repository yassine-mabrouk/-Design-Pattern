package Decorator.example1.composant;

public class ComposantImpl extends ComposantAbstract {
    @Override
    public void operation() {
        System.out.println("function called from "+ this.getClass().getSimpleName());
    }
}
