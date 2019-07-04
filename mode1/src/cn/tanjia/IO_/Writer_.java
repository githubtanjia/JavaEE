package cn.tanjia.IO_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: tanjia
 * @Date: 2019/7/4 20:20
 */

/**
 * 【注意】关闭资源时,与FileOutputStream不同。 如果不关闭,数据只是保存到缓冲区，并未保存到文件。
 *
 * 因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。
 * 是关闭的流对象，是无法继续写出数据 的。
 * 如果我们既想写出数据，又想继续使用流，就需要 flush 方法了。
 * flush ：刷新缓冲区，流对象可以继续使用。
 * close :先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
 */
public class Writer_ {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("F:\\file2\\aaaa.txt");
        fw.write(97);
        fw.write("去");
        fw.write('a');
        fw.write(30000);

        fw.flush();

        fw.write("换个撒");

        fw.close();
    }
}
