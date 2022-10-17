package chapter10;

public class MyClass implements MyInterface{

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("X()");
    }

    @Override
    public void y() {
        System.out.println("Y()");
    }
}
