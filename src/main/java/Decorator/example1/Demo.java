package Decorator.example1;

import Decorator.example1.composant.ComposantAbstract;
import Decorator.example1.composant.ComposantImpl;
import Decorator.example1.decorators.DecoratorImpl1;
import Decorator.example1.decorators.DecoratorImpl2;
//============Description =======================
/*
* a simple implementation of the decorator design pattern
* */
public class Demo {
    public static void main(String[] args) {
        ComposantAbstract composant=new ComposantImpl();
        composant.operation();
        composant=new DecoratorImpl1();
        composant.operation();
        composant=new DecoratorImpl2();
        composant.operation();

    }
}
