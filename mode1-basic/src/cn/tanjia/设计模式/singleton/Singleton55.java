package cn.tanjia.设计模式.singleton;

/**
 * @Author: tanjia
 * @Date: 2019/7/16 1:40
 *
 * 登记式/静态内部类
 *  是否lazy初始化：是
 *  是否多线程安全：是
 *      有时候该类被使用时不想被实例化，通过静态这种方式很适合
 */
public class Singleton55 {

    private static class SingletonHolder{
        private static final Singleton55 instance = new Singleton55();
    }

    public Singleton55() {
    }

    public static final Singleton55 getInstance(){
        return SingletonHolder.instance;
    }

}
