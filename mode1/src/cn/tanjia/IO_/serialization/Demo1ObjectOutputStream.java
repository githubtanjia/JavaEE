package cn.tanjia.IO_.serialization;

/**
 * @Author: tanjia
 * @Date: 2019/7/5 2:04
 */

import java.io.*;

/**
 * 对象的序列化
 * java.io.ObjectOutputStream 类，
 * 将Java对象的原始数据类型写出到文件,实现对象的持久存储。
 *
 * 1.创建ObjectOutputStream对象，构造方法中传递输出流
 * 2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
 * 3.释放资源
 *
 * 对象的反序列化
 * ObjectInputStream反序列化流，
 * 将之前使用ObjectOutputStream序列化的原始数据恢复为对象。
 *
 * 1.创建ObjectInputStream对象，构造方法中传递输入流
 * 2.使用ObjectInputStream对象中的方法readObject，读取保存对象的文件
 * 3.释放资源
 */
public class Demo1ObjectOutputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\file\\seri\\person.txt"));
        oos.writeObject(new Person("小白",18));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\file\\seri\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);

    }

}
