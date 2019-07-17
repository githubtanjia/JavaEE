package cn.tanjia.线程;

/**
 * @Author: tanjia
 * @Date: 2019/6/29 23:57
 */
public class MyThread1 extends Thread {

    public MyThread1(){}

    public MyThread1(String name){
        super(name);
    }

    @Override
    public void run() {
        /*for (int i = 0; i < 20; i++) {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("MyThread1 " + i);
        }*/
        System.out.println(currentThread() +" "+ currentThread().getName() +" "+ getName() );
    }
}
