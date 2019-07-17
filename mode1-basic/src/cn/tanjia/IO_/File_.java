package cn.tanjia.IO_;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * @Author: tanjia
 * @Date: 2019/7/2 23:43
 */
public class File_ {

    public File_(){
        //File();
    }

    public static void main(String[] args) throws Exception {
        //fileConstructor();
        //a();//死循环，内存溢出
        //b();//i==5结束

        //System.out.println(sum(5)); //递归累加求和1 - n

        //递归遍历文件夹
        File dir = new File("f:\\file");
        printf4(dir);

    }
    private static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void printf(File dir){//遍历所有文件和目录
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
                System.out.println("文件名" + file.getName());
            }else {
                System.out.println("当前目录:" + file.getName());
                printf(file);
            }
        }
    }
    public static void printf2(File dir){//获得目录下所有.java文件
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile() /*&& file.getName().endsWith(".java") 注意不能这么写，和else里结合逻辑不通 */){
                if (file.getName().endsWith(".java")) {
                    System.out.println("文件是.Java的：" + file.getName());
                }
            }else {
                //System.out.println("当前目录:" + file.getName());
                printf2(file);
            }
        }
    }
    public static void printf3(File dir){
        File[] files =dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")|| pathname.isDirectory();
            }
        });
        for (File file : files) {
            if (file.isFile()){
                System.out.println("文件名" + file.getName());
            }else{
                printf3(file);
            }
        }
    }
    public static void printf4(File dir){
        File[] files =dir.listFiles((File pathname) -> {
                return pathname.getName().endsWith(".java")|| pathname.isDirectory();
            }
        );
        for (File file : files) {
            if (file.isFile()){
                System.out.println("文件名" + file.getName());
            }else{
                printf3(file);
            }
        }
    }



    private static void a(){
        a();
    }
    private static void b(int i){
        b(i++);
        i++;
        if (i == 5){
            return;
        }
    }


    public static void fileConstructor() throws Exception {
        //文件/目录 不论是否存在，都不会影响对象的创建，它也不会去创建文件/目录
        /*File f = new File("f:\\file\\a.txt");
        System.out.println("文件绝对路径：" + f.getAbsolutePath());
        System.out.println("文件构造路径：" + f.getPath());
        System.out.println("文件名称：" + f.getName());
        System.out.println("文件长度：" + f.length());//字节
        File f2 = new File("f:/file");
        System.out.println("目录绝对路径：" + f2.getAbsolutePath());
        System.out.println("目录构造路径：" + f2.getPath());
        System.out.println("目录名称：" + f2.getName());
        System.out.println("目录长度：" + f2.length());//永远是0
        File file = new File("bb.txt");
        System.out.println(file.getAbsolutePath()); //会返回相对项目的路径+bb.txt
        System.out.println();
        System.out.println(f.exists() + "  是否文件："+f.isFile());
        System.out.println(f2.exists() + "  是否目录："  +f2.isDirectory());
        System.out.println(file.exists() );
        File f4 = new File("f:\\file\\b.txt");
        System.out.println( f4.createNewFile());
        File f5 = new File("f:\\file2\\f2");
        System.out.println( f5.mkdir());
        System.out.println(f4.delete());
        System.out.println(f5.delete());//如果此File表示目录，则目录必须为空才能删除。*/

       /* System.out.println("traverse...");
        File dir = new File("f:\\file");
        String[] names = dir.list();//获取 当前目录下 所有的文件和文件夹的名称
        for (String name : names) {
            System.out.println(name);
        }
        File[] files = dir.listFiles();
        //用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。
        for (File file : files) {//获取 当前目录下 所有的文件和文件夹对象
            System.out.println(file);
        }*/
    }




}
