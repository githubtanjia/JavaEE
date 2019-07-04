package cn.tanjia.IO_;

/**
 * @Author: tanjia
 * @Date: 2019/7/1 2:43
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * FileOutputStream:字节输出流（内存中的数据->硬盘的文件）
 */
//如何写入数字 97 ？
public class OutputStream_ {
    /**
     * 1.创建一个FileOutputStream对象，构造方法传入数据的目的地
     * 2.调用FileOutputStream对象中的方法write，吧数据写入到文件中
     * 3.释放资源
     */

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("F:\\file\\fos.txt");
       /* FileOutputStream fos = new FileOutputStream(new File("F:\\file\\fos.txt"),true);
        fos.write(97);

        byte[] b = "麓谷小镇".getBytes();
        fos.write(b);*/

       byte[] b = {97,98,99,100};
        for (int i = 0; i < b.length; i++) {
            fos.write(b[i]);
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }

}
