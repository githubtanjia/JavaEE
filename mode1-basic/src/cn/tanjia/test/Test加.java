package cn.tanjia.test;

/**
 * @Author: tanjia
 * @Date: 2019/7/12 12:39
 */
public class Test加 {

    public static void main(String[] args) {
        int i = 0;
        Test加 t = new Test加();
        t.add(i);
        System.out.println(i);

        int[] a = {1,3,5,6};
        System.out.println(a);

        char[] c = {'w','4'};
        System.out.println(c);

        String[] s = {"weq","as"};
        System.out.println(s);

    }

    public void add(int i){
        i++;
    }

}
