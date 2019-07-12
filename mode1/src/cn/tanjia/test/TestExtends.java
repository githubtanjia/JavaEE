package cn.tanjia.test;

/**
 * @Author: tanjia
 * @Date: 2019/7/12 12:33
 */
public class TestExtends {


    public static void main(String[] args) {
        final son son = new son();
    }
    
}

class p {
    public p() {
        System.out.println("p...");
    }
}

class son extends p {
    public son() {
        System.out.println("son...");
    }
}

class t {
    public t() {
        System.out.println("t...");
    }
}
