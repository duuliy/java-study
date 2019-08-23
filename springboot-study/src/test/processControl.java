package test;
import java.util.*;  //包含Scanner等方法
public class processControl {
    public static void main(String[] args) {
        System.out.print("A,");
        System.out.print("B");//不会换行
        System.out.println("END");//会换行

        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("输入你的名字: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("输入你的年龄: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出使用的

        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1.equals(s2));


        int[] ns2 = { 1, 155, 210, 3, 5, 8 };
        Arrays.sort(ns2);
        System.out.println(Arrays.toString(ns2));

        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        int g=0;
        int max=ns.length-1;
        for(int i=0;i<max;i++){  //冒泡
            for(int j=0;j<max-i;j++){
                g++;
                if (ns[j] > ns[j+1]) {
                    int tmp=ns[j];
                    ns[j]=ns[j+1];
                    ns[j+1]=tmp;
                }
            }
        }
        System.out.println(g);
        System.out.println(Arrays.toString(ns));

        int[][] nns = { //二维数组  3.4.5...维同理
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        for (int[] arr : nns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(',');
            }
            System.out.println();
        }
    }
}

/**
 * scanner 扫描器
 * */


/**
 *  输入和输出
 * %d	格式化输出整数
 * %x	格式化输出十六进制整数
 * %f	格式化输出浮点数
 * %e	格式化输出科学计数法表示的浮点数
 * %s	格式化字符串
 *
 * 常见的转义字符包括：
 *
 * \" 表示字符"
 * \' 表示字符'
 * \\ 表示字符\
 * \n 表示换行符
 * \r 表示回车符
 * \t 表示Tab
 * */

/**
 * if else if和javascript一样
 * 要判断引用类型的变量内容是否相等，必须使用equals()方法：
 *
 * switch,for,while,do while,break和continue同js
 * */

/**
 * 数组看例子
 *
 *
 * */