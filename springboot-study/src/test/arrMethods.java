package test;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class arrMethods {
    public static void main(String[] args) {

        int[] arr = {5,6};
        System.out.println(arr[0]);

        //填充数组
        Arrays.fill(arr, 2);

        int[] i = new int[10];
        System.out.println(Arrays.toString(i));
        Arrays.fill(i, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(i));

        //复制数组
        int[] b = new int[12];
        System.arraycopy(i, 0, b, 2, 5);
        System.out.println(Arrays.toString(b));

        //一维数组的比较
        int[] c = new int[3];
        int[] d = new int[3];
        Arrays.fill(c, 3);
        Arrays.fill(d, 3);
        System.out.println(c.equals(d));
        System.out.println(Arrays.equals(c, d));
        System.out.println("-------------");
        int[][] a1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] a2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(a1.equals(a2));
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(Arrays.deepEquals(a1, a2));
        //深度toString()
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.deepToString(a1));

        //数组的排序
        int[] a3 = {3, 2, 5, 4, 1,-1,-9};
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));


        //一维数组数值检索
        int index1 = Arrays.binarySearch(a3, 1);
        int index2 = Arrays.binarySearch(a3, -16);
        int index3 = Arrays.binarySearch(a3, 9);  //长度-（6+1）=-7
        int index4 = Arrays.binarySearch(a3, 0);  //负数长度-（2+1）=-3
        System.out.println(index1 + " " + index2 + " " + index3);

//        JSON.DEFAULT_GENERATE_FEATURE();
    }
}


/**
 * 数组方法：
 * 内存一旦分配不能改变，所有说数组长度固定
 *
 * arraycopy() srcPos:源数组要复制的起始位置, destPos:目的数组放置的起始位置,length:复制的长度。
 *
 * 在java里面js的对象不是数据结构，而是json对象，使用的也是json的操作方法。。
 * 比js麻烦太多
 * */