package test;


import java.lang.annotation.*;

public class comment {
//    @Check(min=0, max=100, value=55)
    public int n;

    public static void main(String[] args){

    }

    @Inherited
    @Target({ElementType.METHOD, ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Report {
        int type() default 0;
        String level() default "info";
        String value() default "";
    }
}





/**
 * 注释
 *
 * 第一类是由编译器使用的注解
 * @Override：让编译器检查该方法是否正确地实现了覆写；
 * @SuppressWarnings：告诉编译器忽略此处代码产生的警告。
 *
 * 第二类是由工具处理.class文件使用的注解
 * 一般我们不必自己处理。
 *
 * 第三类是在程序运行期能够读取的注解
 * 一个配置了@PostConstruct的方法会在调用构造方法后自动被调用
 * （这是Java代码读取该注解实现的功能，JVM并不会识别该注解)
 * eg: swgger使用的。
 *
 *
 * */



/**
 * 定义注解
 *
 * @Target
 * 使用@Target可以定义Annotation能够被应用于源码的哪些位置：
 * 类或接口：ElementType.TYPE；
 * 字段：ElementType.FIELD；
 * 方法：ElementType.METHOD；
 * 构造方法：ElementType.CONSTRUCTOR；
 * 方法参数：ElementType.PARAMETER。
 * 加上[] 就是数组的写法。
 *
 *
 * @Retention  只有这个会影响代码逻辑
 * 另一个重要的元注解@Retention定义了Annotation的生命周期：
 * 仅编译期：RetentionPolicy.SOURCE；
 * 仅class文件：RetentionPolicy.CLASS；
 * 运行期：RetentionPolicy.RUNTIME。
 *
 *
 * @Repeatable
 * 定义Annotation是否可重复。
 *
 * @Inherited
 * 定义子类是否可继承父类定义的Annotation
 * 仅针对@Target(ElementType.TYPE)类型的annotation有效
 *
 * */

/**
 * 处理注解：
 *
 *
 * */
