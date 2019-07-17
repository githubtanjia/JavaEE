package cn.tanjia.IO_;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: tanjia
 * @Date: 2019/7/4 20:19
 */
public class Reader_ {
    public static void main(String[] args) throws IOException {
        //FileReader fr = new FileReader("F:\\file\\a.txt");
        FileReader fr = new FileReader(new File("F:\\file\\a.txt"));

        //每次读取一个字符
        /*int len;
        while ( (len = fr.read()) != -1){
            System.out.println((char)len);  //虽然读取了一个字符，但是会自动提升为int类型。
        }*/

        //读取一个字符数组
        int len;
        char[] cs = new char[5];
        while ((len = fr.read(cs)) != -1){
            System.out.println(new String(cs));
        }

        fr.close();
    }
}
