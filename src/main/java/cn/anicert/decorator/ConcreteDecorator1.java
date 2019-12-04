package cn.anicert.decorator;

public class ConcreteDecorator1 extends Decorator {


    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        this.doAnotherThing2();
    }

    private void doAnotherThing2() {
        System.out.println("功能C");
    }
}
