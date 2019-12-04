package cn.anicert.decorator;

/**
 * 装饰者，需维护被装饰者实例
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomeThing() {
        component.doSomeThing();
    }

}
