package cn.tanjia.线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: tanjia
 * @Date: 2019/6/30 21:33
 */
public class ThreadPool {
    public static void main(String[] args) {
        //创建线程池对象 即生成线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //从线程池获取一个线程，开启线程，执行run方法
        pool.submit(new RunImpl());
        pool.submit(new RunImpl());
        pool.submit(new RunImpl());

        pool.shutdown();//关闭线程池，不建议关闭
    }
}
