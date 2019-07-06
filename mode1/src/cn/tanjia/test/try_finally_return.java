package cn.tanjia.test;

/**
 * @Author: tanjia
 * @Date: 2019/7/5 6:44
 */
public class try_finally_return {


    public static void main(String[] args) {
        System.out.println("最终结果:"+a());
    }

    public static int a(){
        int i = 0;
        try {
            System.out.println("try...");
            return i;
        }catch (Exception e){
            return 10;
        }finally {
            System.out.println("finally...");
            //return ++i;
        }
    }


}
