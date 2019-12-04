package cn.anicert.decorator;

public class Client {

    public static void main(String[] args) {
        Component decorator = new ConcreteDecorator1(new ConcreteDecorator(new ConcreteComponent()));
        decorator.doSomeThing();
    }

}
