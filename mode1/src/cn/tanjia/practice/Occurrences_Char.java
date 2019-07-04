package cn.tanjia.practice;

import java.util.*;

/**
 * @Author: tanjia
 * @Date: 2019/6/26 16:01
 */
public class Occurrences_Char {

    /**
     * 统计各字符串出现的次数-----并且按照出现的次数排序
     * 1.将字符串转换为字符数组，遍历该数组
     * 使用map存储，key存储字符，value存储出现次数，存储方式如下
     *          false（不存在）：value=1
     *          true（存在）：value++
     *  2.
     *  遍历map，看是否存在，根据key返回value，存在则返回value
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input one string:");
        String str = sc.next();
        /**
         * 转换为数组，并且存入map(指定map类型)
         */
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap();
        for (char c : chars) {
            if(map.containsKey(c)){//key存在，value+1
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList();

        /**
         *   ！遍历map，返回value
         *   遍历map,存入map
         */
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry);
        }

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }



}
