package com.gao.decorator;

public class ConcreteDecoratorA extends Decorator {

    @Override
    void operation() {
        super.operation();
        setAddedState("Processing");

        System.out.println(String.format("%s, 具体装饰对象A的操作", getAddedState()));
        addedBehavior();
    }


    private void addedBehavior() {

        System.out.println(String.format("%s, 装饰者A赋予新的功能", getAddedState()));
    }
}
