package cn.tanjia.线程;

/**
 * @Author: tanjia
 * @Date: 2019/6/30 21:37
 */
public class RunImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("创建了一个新线程:"+ Thread.currentThread().getName());
    }
}
