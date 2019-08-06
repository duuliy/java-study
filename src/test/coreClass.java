package test;

import java.util.Arrays;

public class coreClass {
    public static void main(String[] args) {
        //实际上字符串在String内部是通过一个char[]数组表示的
        String s = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        System.out.println(s);
        String s2 = s.toUpperCase();
        System.out.println(s2);
        String s1 = "hello";
        System.out.println(s1 == s);
        System.out.println(s1.equals(s));

        "Hello".contains("ll"); // true
        "hello".replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'


        String str2 = "A,B,C,D";
        String[] str3 = str2.split(","); // {"A", "B", "C", "D"}
        System.out.println(Arrays.toString(str3));

        String[] arr = {"A", "B", "C"};
        String arr2 = String.join("***", arr); // "A***B***C"
        System.out.println(arr2);

        char[] cs = "Hello".toCharArray(); // String -> char[]
        System.out.println(Arrays.toString(cs));
        String ssd = new String(cs); // char[] -> String
        System.out.println(ssd);


    }
}



/**
 * 字符串和编码：
 *
 * String是一个引用类型，它本身也是一个class。但是，Java编译器对String有特殊处理，即可以直接用"..."来表示一个字符串：
 * 两个字符串比较，必须总是使用equals()方法。
 * equalsIgnoreCase()可以忽略大小写。
 *
 * toLowerCase 转小写
 * toUpperCase 转大写
 *
 * contains 是否包含 boolen ,js的是dom结构
 *
 * 与js相同作用的内置方法：
 * indexOf,
 * lastIndexOf,
 * startsWith,
 * endsWith,
 * substring,
 * trim
 * replace (java替换所有，js只替换第一个,想全部替换用正则)
 * split 分割字符串
 *
 * js没有的方法（java8还没有的方法）:
 * strip 去掉空格（包括中文空格）
 * stripLeading 去掉头部空格
 * stripTrailing 去掉尾部空格
 * replaceAll 正则方式替换
 * isEmpty 字符串是否为空
 * isBlank 是否只包含空白字符
 * join 字符串拼接 （js是数组方法）
 *
 *
 * 类型转换：
 * String.valueOf(xx)
 * Integer.parseInt("123") 转数字
 * Boolean.parseBoolean("true")
 * String和char[]类型可以互相转换，方法是：
 * (，它并不会直接引用传入的char[]数组，而是会复制一份，所以，修改外部的char[]数组不会影响String实例内部的char[]数组，因为这是两个不同的数组。)
 * char[] cs ="Hello".toCharArray(); // String -> char[]
 * String s = new String(cs); // char[] -> String
 *
 * 改变编码：
 * "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
 * "Hello".getBytes("GBK"); // 按GBK编码转换
 * 注意：转换编码后，就不再是char类型，而是byte类型表示的数组。
 * 始终牢记：Java的String和char在内存中总是以Unicode编码表示。
 *
 *
 * 小结:
 * Java字符串String是不可变对象；
 * 字符串操作不改变原字符串内容，而是返回新字符串；
 * 常用的字符串操作：提取子串、查找、替换、大小写转换等；
 * Java使用Unicode编码表示String和char；
 * 转换编码就是将String和byte[]转换，需要指定编码；
 * 转换为byte[]时，始终优先考虑UTF-8编码。
 * */