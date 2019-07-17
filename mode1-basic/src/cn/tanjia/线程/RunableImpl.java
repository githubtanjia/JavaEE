package cn.tanjia.线程;

/**
 * @Author: tanjia
 * @Date: 2019/6/30 0:40
 */
public class RunableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
