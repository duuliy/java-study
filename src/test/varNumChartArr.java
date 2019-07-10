package test;

public class varNumChartArr {
    public static void main(String[] args) {
        int x=12345/60;//int计算结果直接舍去小数
        System.out.println("Hello, world!");
        System.out.println(x);
        float f1 = 3.14f;
        System.out.println(f1);
        final double f2= 3.66;//定义变量的时候，如果加上final修饰符，这个变量就变成了常量,根据习惯，常量名通常全部大写.
        System.out.println(f2);
        int i=12345;
        short s=(short) i;//强制大转换小类型
        System.out.println(s);
    }
}

/**
 *全局只能有一个的Hello类public相当于js的export
 * 系统输出打印System.out.println()
 *
 * 基本数据类型:
 * 整数类型：byte(-128 ~ 127)，short(-32768 ~ 32767)，int( -2147483648 ~ 2147483647)，long(-9223372036854775808 ~ 9223372036854775807)
 * 浮点数类型：float(3.4x1038,必加f,不然默认double)，double(1.79x10308)
 * 字符类型:char(注意char类型使用单引号，且仅有一个字符，要和双引号的字符串类型区分开.)
 * 布尔类型:boolean
 * var不同js 是定义类型的
 *
 * */


/**
 * 运算:
 * //加减乘除余都同js, 还有++和--
 * //位运算是<<
 * &和|同js的&&和||
 *
 * ~非运算， ^ 异或运算
 *
 * 优先级:
 *
 * 在Java的计算表达式中，运算优先级从高到低依次是：
 *
 *  ()
 *  ! ~ ++ --
 *  * / %
 *  + -
 *  << >> >>>
 *  &
 *  |
 *  += -= *= /=
 *
 *  在运算过程中，如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型。
 *  例如，short和int计算，结果总是int，原因是short首先自动被转型为int：
 */


/**
 * 浮点数:
 * 运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算。
 * 浮点数有个非常重要的特点，就是浮点数常常无法精确表示。
 */
