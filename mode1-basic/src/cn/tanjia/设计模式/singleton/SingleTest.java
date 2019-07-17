package cn.tanjia.设计模式.singleton;

/**
 * @Author: tanjia
 * @Date: 2019/7/15 18:37
 * 单例模式：（创建型模式）
 *  #涉及一个单一的类，该类负责创建自己的对象，同时确保只有一个对象被创建
 *  #这个类提供一种唯一的访问方式，可直接访问，不需要实例化该类的对象
 */
public class SingleTest {
    public static void main(String[] args) {

        Singleton1 instance = Singleton1.getInstance();
        instance.showMessage();

    }
}
