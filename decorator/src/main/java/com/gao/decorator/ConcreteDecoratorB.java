package com.gao.decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {

        super.operation();
        setAddedState("Finished");

        System.out.println(String.format("%s, 具体装饰对象B俄操作", getAddedState()));
    }
}
