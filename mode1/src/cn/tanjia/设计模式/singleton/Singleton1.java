package cn.tanjia.设计模式.singleton;

/**
 * @Author: tanjia
 * @Date: 2019/7/15 18:40
 *
 * 懒汉式，线程不安全
 *  是否lazy初始化：是
 *  是否多线程安全：否
 *      多线程不安全
 */
public class Singleton1 {

    private static Singleton1 instance;
    public Singleton1() {}
    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton1...");
    }

}
