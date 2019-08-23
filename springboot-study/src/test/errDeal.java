package test;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
        double x = Math.abs(-123.45);
        assert x >= 0: "x must >= 0";
        System.out.println(x);

        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");

        //Commons Logging
        Log log = LogFactory.getLog(errDeal.class);
        log.info("start...");
        log.warn("end.");
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
 * 使用断言(assert):
 * 要执行assert语句，必须给Java虚拟机传递-enableassertions（可简写为-ea）参数启用断言。所以，上述程序必须在命令行下运行才有效果：
 * $ java -ea Main.java
 * ts断言是指定一个已写类型，而java只是判断真假，并且不用项目中。
 * 实际开发中，很少使用断言。更好的方法是编写单元测试
 *
 * */

/**
 * 使用日志：
 * 因为默认级别是INFO，因此，INFO级别以下的日志，不会被打印出来。
 * 7个日志级别:
 * SEVERE
 * WARNING
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST
 *
 * Java标准库内置的Logging使用并不是非常广泛(基本上没人用)
 *
 * Apache创建的日志模块:
 * Commons Logging是一个第三方日志库（日志接口）
 * 配合Log4j(日志实现)来使用
 *
 * Log4j 输出地址:
 *
 * console：输出到屏幕；
 * file：输出到文件；
 * socket：通过网络输出到远程计算机；
 * jdbc：输出到数据库
 *
 * 在开发阶段，始终使用Commons Logging接口来写入日志，并且开发阶段无需引入Log4j。如果需要把日志写入文件，
 * 只需要把正确的配置文件和Log4j相关的jar包放入classpath，
 * 就可以自动把日志切换成使用Log4j写入，无需修改任何代码。
 *
 * */