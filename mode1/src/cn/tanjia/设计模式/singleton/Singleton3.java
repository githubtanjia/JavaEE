package cn.tanjia.设计模式.singleton;

/**
 * @Author: tanjia
 * @Date: 2019/7/15 18:47
 *
 * 饿汉式：线程安全
 *  是否lazy初始化：否
 *  是否多线程安全：是
 *      没有加锁，执行效率提高
 *      类加载时就初始化，浪费内存，容易产生垃圾对象
 */
public class Singleton3 {

    //创建SingleObject的对象
    private static Singleton3 instance = new Singleton3();

    //让构造方法为private，这样就不会被实例化
    private Singleton3() {
    }

    //获取该类唯一可用的对象的方法
    public static Singleton3 getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton3...");
    }


}
