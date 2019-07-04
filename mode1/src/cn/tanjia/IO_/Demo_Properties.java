package cn.tanjia.IO_;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: tanjia
 * @Date: 2019/7/4 20:35
 */
public class Demo_Properties {
    public static void main(String[] args) throws IOException {

       /* Properties p = new Properties();
        p.setProperty("name","tanjia");
        p.setProperty("password","123456");

        System.out.println(p);

        System.out.println(p.getProperty("name"));

        Set<String> strings = p.stringPropertyNames();
        for (String key : strings) {
            System.out.println("key:" + key +"  value:" + p.getProperty(key));
        }
*/

       /*Properties p = new Properties();
       p.setProperty("去","去去");
       p.setProperty("啊","啊啊");
       p.setProperty("我","我我");

       p.store(new FileWriter("F:\\file2\\kkk.txt"),"注释");*/

        Properties p = new Properties();
        p.load(new FileReader("F:\\file2\\kkk.txt"));

        Set<String> strings = p.stringPropertyNames();
        for (String s : strings) {
            System.out.println(s + "  " + p.getProperty(s));
        }

    }
}
