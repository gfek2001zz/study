package com.gao.decorator;

public class Client {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent("Pending");
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();


        d1.setCompoent(c);
        d2.setCompoent(d1);

        d2.operation();
    }
}
