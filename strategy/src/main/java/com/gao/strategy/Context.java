package com.gao.strategy;

public class Context {

    private IStrategy strategy;

    public Context(String type) {
        if ("算法A".equals(type)) {
            strategy = new ConcreteStrategyA();
        } else if ("算法B".equals(type)) {
            strategy = new ConcreteStrategyB();
        } else if ("算法C".equals(type)) {
            strategy = new ConcreteStrategyC();
        }
    }


    public void contextInterface() {
        strategy.algorithmlInterface();

    }
}
