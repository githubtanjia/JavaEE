package cn.tanjia.线程;

/**
 * @Author: tanjia
 * @Date: 2019/6/29 23:58
 */


import static java.lang.Thread.currentThread;

/**
 * 实现多线程的两种方式：
 *      1.继承Thread类
 *          1.创建一个Thread的子类
 *          2.在子类中重写Thread类的run方法，设置线程任务
 *          3.创建子类对象
 *          4.调用Thread类中的start方法，开启新线程，执行run方法
 *      2，实现Runnable接口
 *          1.创建Runnable解耦的实现类
 *          2.在实现类重写Runnable的run方法
 *          3.创建实现类的对象
 *          4.创建Thread类对象，构造方法中传递实现类对象
 *          5.调用Thread类中的start方法，开启新线程，执行run方法
 */
public class Test1 {
    public static void main(String[] args) {


        /**
         * 方式1
         */
        MyThread1 thread1 = new MyThread1();
        thread1.setName("线程1");
        thread1.start();

        new MyThread1("线程2").start();   //此处注意

        /*for (int i = 0; i < 20; i++) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("main " + i);
        }*/
        System.out.println(currentThread() +" "+ currentThread().getName()  );


    }
}
