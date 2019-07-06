package cn.tanjia.IO_.serialization;

import java.io.Serializable;

/**
 * @Author: tanjia
 * @Date: 2019/7/5 2:06
 */
public class Person implements Serializable {
    private String name;
    private int age;

   /* private static int a;//先于对象
    private transient int b;*/

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
