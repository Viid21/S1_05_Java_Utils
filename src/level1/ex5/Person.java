package level1.ex5;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
