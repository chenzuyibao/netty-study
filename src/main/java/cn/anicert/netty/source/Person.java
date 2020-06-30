package cn.anicert.netty.source;

/**
 * @author chenzuyi
 * @create 2020-06-29 23:31
 */
public abstract class Person {

    protected int a = 10;

    public Person() {
        System.out.println("this is Person");
    }

    public abstract void study();

}

class Student extends Person {

    public Student() {
        super();
        System.out.println("this is student");
    }

    @Override
    public void study() {
        a = 20;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.a);
        student.study();
        System.out.println(student.a);

        Student student1 = new Student();
        System.out.println(student1.a);
        student1.study();
        System.out.println(student1.a);

    }
}
