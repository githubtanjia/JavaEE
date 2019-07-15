package cn.tanjia.设计模式.singleton;

/**
 * @Author: tanjia
 * @Date: 2019/7/15 18:43
 *
 * 懒汉式：线程安全
 *  是否lazy初始化：是
 *  是否多线程安全：是
 *      第一次调用才初始化，避免内存浪费，
 *      但是加锁影响效率
 */
public class Singleton2 {
    private static Singleton1 instance;
    public Singleton2() {}
    public static synchronized Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton2...");
    }
}
