package cn.tanjia.IO_;

/**
 * @Author: tanjia
 * @Date: 2019/7/4 21:25
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Set;

/**
 * 1.创建一个hashmap集合对象，key存序号，value存每行的文本
 * 2.3.创建字符缓冲输入/输出流对象，构造方法绑定输入/输出流
 *
 * 4.使用字符缓冲输入流的readline，逐行读取文本
 * 5.把读取的文本切割，获取序号和文本内容
 * 6.把切割好的序号和文本分别存入hashmap（key会自动排序,为什么）
 *
 * 7.8.遍历hashmap，将key和value拼接为一个文本行
 * 9.将文本行，使用字符缓冲输出流的方法write，写入到文件中
 * 10.释放资源
 */
public class Test_buffer {
    public static void main(String[] args) throws Exception{
        HashMap<String, String> hashmap = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("F:\\file\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\file\\out.txt"));

        String line = null;
        while ( (line = br.readLine()) != null) {
            String[] split = line.split("\\.");
            hashmap.put(split[0],split[1]);
        }
        br.close();

        for (int i = 1; i <= hashmap.size(); i++) {
            String key = String.valueOf(i);
            String value = hashmap.get(key); //获取对应的文本
            String l = key + "." + value;
            bw.write(l);
            bw.newLine();
        }
        bw.close();


    }
}
