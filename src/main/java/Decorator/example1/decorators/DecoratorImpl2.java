package Decorator.example1.decorators;

public class DecoratorImpl2 extends DecoratorAbstract {
    @Override
    public void operation() {
        System.out.println("function called from "+ this.getClass().getSimpleName());
    }
}
