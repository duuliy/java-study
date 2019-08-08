package test;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

public class errDeal {

    public static void main(String[] args) {
//        try {
        //程序执行
//            process1();
//            process2();
//            process3();
//        } catch (UnsupportedEncodingException e) {
//            System.out.println("Bad encoding");
//        } catch (IOException e) {
//            System.out.println("IO error");
//        } finally(){
            //必然会执行的
//        }
    }

    public static void main2(String[] args) throws Exception {

    }

    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        // 此方法就是方便让其他方法调用它 抛错
        // 用指定编码转换String为byte[]:
        return s.getBytes("GBK");
    }
}


/**
 * Java的异常:
 * 一个健壮的程序必须处理各种各样的错误。
 *
 * 调用方如何获知调用失败的信息？有两种方法：
 * 方法一：约定返回错误码。
 *
 * 方法二：在语言层面上提供一个异常处理机制。
 *
 * e.printStackTrace()
 * 所有异常都可以调用printStackTrace()方法打印异常栈，这是一个简单有用的快速打印异常的方法。
 *
 * UnsupportedEncodingException 编码格式
 * 比如你文件都不到的时候
 * 你在做数据库操作的时候数据库底层出现问题
 * 或者你系统IO出问题了
 * 系统拿不到文件句柄:
 * IOException
 *
 *
 * 多个catch，前面的不能是后面的父类，否则catch不到
 *
 * 当某个方法抛出了异常时，如果当前方法没有捕获异常，异常就会被抛到上层调用方法，直到遇到某个try ... catch被捕获为止
 *
 *
 * */

/**
 * 自定义错误:
 * 在一个大型项目中，可以自定义新的异常类型，但是，保持一个合理的异常继承体系是非常重要的。
 * 一个常见的做法是自定义一个BaseException作为“根异常”，然后，派生出各种业务类型的异常。
 *
 * */

/**
 * 使用断言:
 * 
 *
 * */