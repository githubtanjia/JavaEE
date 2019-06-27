package cn.tanjia.jihe;

import java.util.*;

/**
 * @Author: tanjia
 * @Date: 2019/6/14 13:13
 * 对单列集合的一些简单结论
 */
public class Collection_list_set {

    public static void main(String[] args) {

        //List：有序，可重复，有索引
        /**
         * ArrayList和LinkedList的区别
         * ArrayList:底层是数组，所有具有数组的特点，查找快
         * LinkedList:底层是链表，所以具有链表的特点，查找慢   对于增删，需要思考分析
         * Vector:线程安全的ArrayList
         */
        //list
        List<String> arrayList = new ArrayList<>(5);
        List<String> linkedList = new LinkedList<>();

        /**
         * ArrayList底层实现原理：
         * 是数组  初始容量10 扩容1.5倍
         */


        //Set：无序，不重复，无索引
        /**
         * HashSet和TreeSet的区别
         * HashSet底层是哈希表，数据是无序的，可以放入null值但是只能放一个
         * TreeSet底层是二叉树，数据是有序的，不可以放入null值
         * HashSet要求放入的对象必须重写了hashcode方法
         */
        Set<String> hashSet = new HashSet();
        Set<String> treeSet = new TreeSet();
        Set<String> linkedHashSet = new LinkedHashSet<>();//链表+哈希表
        /**
         * hashSet的底层是哈希表（它相当于一个value固定的hashmap，而hashmap的底层是哈希表）
         * HashSet保证不重复元素的前提是 存入的对象重写了hashcode和equals方法
         */




    }

}
