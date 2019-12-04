package cn.anicert.decorator;


public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        this.doAnotherThing();
    }

    void doAnotherThing() {
        System.out.println("功能B");
    }


}
