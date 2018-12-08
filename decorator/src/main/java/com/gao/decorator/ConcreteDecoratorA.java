package com.gao.decorator;

public class ConcreteDecoratorA extends Decorator {

    @Override
    void operation() {
        super.operation();
        addedBehavior();

        System.out.println(String.format("%s, 具体装饰对象A的操作", getAddedState()));
    }


    private void addedBehavior() {

        setAddedState("Processing");

        System.out.println("赋予新的功能");
    }
}
