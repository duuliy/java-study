package test;

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

    }
}



/**
 * 字符串和编码：
 *
 * String是一个引用类型，它本身也是一个class。但是，Java编译器对String有特殊处理，即可以直接用"..."来表示一个字符串：
 * 两个字符串比较，必须总是使用equals()方法。
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
 *
 * js没有的方法（java8还没有的方法）:
 * strip 去掉空格（包括中文空格）
 * stripLeading 去掉头部空格
 * stripTrailing 去掉尾部空格
 * replaceAll 正则方式替换
 *
 *
 *
 * */