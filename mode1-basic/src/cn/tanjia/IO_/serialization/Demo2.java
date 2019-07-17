package cn.tanjia.IO_.serialization;

/**
 * @Author: tanjia
 * @Date: 2019/7/5 2:29
 */

import java.io.*;
import java.util.ArrayList;

/**
 * 序列化集合
 */
public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小白",18));
        list.add(new Person("小黑",19));
        list.add(new Person("小红",20));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\file\\seri\\person.txt"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\file\\seri\\person.txt"));
        Object o = ois.readObject();
        //把object类型的结合转换为ArrayList类型
        ArrayList<Person> lis = (ArrayList<Person>) o;
        for (Person person : lis) {
            System.out.println(person);
        }
        ois.close();

    }
}
