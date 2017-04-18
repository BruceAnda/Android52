package zhaoliang.com.android52.ui.day02.operatorxml.domain;

/**
 * Created by zhaoliang on 2017/4/18.
 */

public class Person {

    public String name;
    public int age;
    public String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
