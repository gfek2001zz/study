package com.gao.decorator;

public class Decorator extends Component {

    private Component component;

    public void setCompoent(Component component) {
        this.component = component;
    }

    @Override
    void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
