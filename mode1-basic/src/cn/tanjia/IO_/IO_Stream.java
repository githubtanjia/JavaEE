package cn.tanjia.IO_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: tanjia
 * @Date: 2019/7/4 20:12
 */
public class IO_Stream {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("F:\\file\\a.txt");
        FileOutputStream fos = new FileOutputStream("F:\\file2\\a_copy.txt");

        int len;
        byte[] b = new byte[1024];
        while ((len = fis.read(b)) != -1){//从硬盘读取到内存
            fos.write(len);//从内存写入硬盘
        }

        fos.close();
        fis.close();

    }
}
