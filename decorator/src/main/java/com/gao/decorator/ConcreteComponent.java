package com.gao.decorator;

public class ConcreteComponent extends Component {

    public ConcreteComponent(String addedState) {
        setAddedState(addedState);
    }

    void operation() {
        System.out.println(String.format("装扮的%s", getAddedState()));
    }
}
