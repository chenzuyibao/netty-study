package cn.anicert.decorator;

/**
 * 具体实现者
 */
public class ConcreteComponent implements Component {

    @Override
    public void doSomeThing() {
        System.out.println("功能A");
    }

}
