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
    }
}




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
 * */