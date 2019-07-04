package cn.tanjia.算法;

/**
 * @Author: tanjia
 * @Date: 2019/6/28 21:56
 */
public class Sort_ {

    public static void main(String[] args) {
        int[] arr = {3,1,5,7,2,8,4,2,10};
        System.out.print("排序前：");
        for (int i : arr) {
            System.out.print(i + "、");
        }

        insertSort(arr);

        System.out.print("排序后：");
        for (int i : arr) {
            System.out.print(i + "、");
        }
    }

    /**
     * 选择排序：每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置
     * @param arr
     */
    public static void selectSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len - 1 ; i++) { //一共需要排序len-1次，这是第i次排序
                int min = i;    //初始最小元素的索引为i
                for (int j = min + 1;j < len;j++){//选出最小元素，获取其索引  //第一个没必要和自己比较
                    if(arr[j] < arr[min]){
                        min = j;    //将最小元素的索引给min
                    }
                }
                if(min != i){   //在本次排序中，将最小的元素移到第一位（即换位）
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min]  = temp;
                }
        }
    }

    /**
     * 冒泡排序：第一次排序中，依次比较相邻的两个元素，若顺序不符合则交换位置，一次排序后将最大（小）的值移到最后。
     *            重复，，直到没有相邻的元素需要交换
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {   //一个需要排序len-1次
            for (int j = 0;j < len - i - 1;j++){//这是第i次排序，最大的元素移到最后一位  注意j的取值
                if (arr[j] > arr[j+1]){//交换相邻两个元素位置
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 插入排序：将一个数据插入到已经排好序的有序数据中
     * @param arr
     */
    public static void insertSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){ //右侧列表，向右的索引，即作为比较对象的数据的索引（i相对于整个列表来说，从1开始）
                                      // （第一个元素作为左侧已经排好序的列表，右侧未排序。）
            int temp = arr[i];  //此次排序中作为插入的元素,即比较的对象
            int leftindex = i-1;    //左侧列表长度=i-1;
            while(leftindex>=0 && arr[leftindex]>temp){//当比到最左边或者遇到比temp小的数据时，结束循环,否则继续比较
                arr[leftindex+1] = arr[leftindex];  //右移一位
                leftindex--;    //左侧列表，从右往左比较 注意，这里leftindex-1
            }
            arr[leftindex+1] = temp;//把temp放到空位上
        }
    }

}
