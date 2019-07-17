package cn.tanjia.集合;

/**
 * @Author: tanjia
 * @Date: 2019/6/22 21:49
 */
public class Test_hashcode {
    public static void main(String[] args) {

        //类对象的哈希值不一样
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.hashCode()+"_"+p1);
        System.out.println(p2.hashCode()+"_"+p2);

        //字符串对象的哈希值 字符串不一样 但是哈希值可能一样
        String s1  = new String("a");
        String s2  = new String("b");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3  = new String("上海");
        String s4 = new String("长沙");
        String s5 = new String("重地");
        String s6 = new String("通话");
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());



    }
}
