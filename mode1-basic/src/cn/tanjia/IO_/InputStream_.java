package cn.tanjia.IO_;

import java.io.File;
import java.io.FileInputStream;

/**
 * @Author: tanjia
 * @Date: 2019/7/4 19:22
 */
public class InputStream_ {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(new File("F:\\file\\fos.txt"));

        //每次读取一个字节
        /*int b;
        while ((b=fis.read()) != -1){
            System.out.println((char)b);
        }*/

        //使用字节数组读取，每次读取多个字节
        int len;
        byte[] b = new byte[2];
        while ((len = fis.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }

        fis.close();
    }
}
