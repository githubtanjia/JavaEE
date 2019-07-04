package cn.tanjia.线程;

/**
 * @Author: tanjia
 * @Date: 2019/6/30 0:41
 */
public class Test2 {
    public static void main(String[] args) {
        RunableImpl runable = new RunableImpl();
        Thread t= new Thread(runable);
        t.start();

        System.out.println(Thread.currentThread().getName());

        Thread t2  = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的方式");
            }
        });
        t2.start();


        //lambda表达式的测试
        new Thread( new Runnable(){
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        } ).start();

        new Thread( () -> System.out.println("lambda") ).start();

    }
}
