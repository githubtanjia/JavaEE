package cn.tanjia.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: tanjia
 * @Date: 2019/6/14 13:46
 * 对双列集合的一些简单结论
 */
public class Map_ {

    /**
     * hashmap的底层：哈希表（初始容量16，负载因子0.75，扩容翻倍）
     *hashmap和hashtable的区别
     *几乎等同，都实现了map接口，
     *  hashmap允许key/value为null（注意key唯一），hashtable不允许key/value为null
     *  hashmap线程不安全，hashtable线程安全。因为后者是synchronize的。
     */
    /**
     *concurrenthashmap：
     */


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("qqq",1);
        map.put("www",2);
        map.put("eee",3);
        map.put("啊",4);
        map.put("是",5);
        map.put("的",6);
        /*//查找键 值
        boolean k = map.containsKey("");
        boolean v = map.containsValue("");*/

        //通过键的set集合遍历
        Set<String> strings = map.keySet();//键的集合
        for (String key : strings) {
            System.out.println("key:" + key + "  value:" + map.get(key));
        }

        /*不推荐
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value:" + value);
        }*/

        System.out.println("====================");

        //通过键值对对象集合遍历
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> m : entrySet) {
            System.out.println("key:"+ m.getKey() +"  value:" + m.getValue());
        }




    }



}
