package cn.tanjia.设计模式.singleton;

/**
 * @Author: tanjia
 * @Date: 2019/7/15 20:43
 *
 * 双检索/双重校验锁
 *  是否lazy初始化：是
 *  是否线程安全：是
 *      安全 且 在多线程情况下能保持高性能
 */
public class Singleton4 {
    private volatile static Singleton4 singleton;

    public Singleton4() { }

    public static Singleton4 getSingleton(){
        synchronized (Singleton4.class){
        if (singleton == null){
            singleton = new Singleton4();
        }
        }
        return singleton;
    }

}
