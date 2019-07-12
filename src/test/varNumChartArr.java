package test;

public class varNumChartArr {
    public static void main(String[] args) {
        int x=12345/60;//int计算结果直接舍去小数
        System.out.println(x);
        float f1 = 3.14f;
        System.out.println(f1);
        final double f2= 3.66;//定义变量的时候，如果加上final修饰符，这个变量就变成了常量,根据习惯，常量名通常全部大写.
        System.out.println(f2);
        int i=12345;
        short s=(short) i;//强制大转换小类型
        System.out.println(s);


        //由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。
        // 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数：

        // 比较x和y是否相等，先计算其差的绝对值:
        double r = Math.abs(0.555 - 0.554);
        // 再判断绝对值是否足够小:
        if (r < 0.00001) {
            System.out.println("可以认为相等");
        } else {
            System.out.println("不相等");
        }

        int n = 5; //如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型：
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);

        //需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况。例如：
        // 24 / 5这个子表达式时，按两个整数进行运算，结果仍为整数4
        double dd = 1.2 + 24 / 5; // 5.2

        //特殊情况
        double d1 = 0.0 / 0; // NaN  //Not a Number
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity

        int n1 = (int) 12.3; // 12
        int n2 = (int) -12.7; // 12
        int n3 = (int) (12.7 + 0.5); // 13
        int n4 = (int) 1.2e20; // 2147483647

        //如果要进行四舍五入，可以对浮点数加上0.5再强制转型：
        int m = (int) (n1 + 0.5);



        //字符类型
        char c1 = 'A';// 包含1个字符
        //字符串类型
        String s1 = "ABC"; // 包含3个字符
        //字符串连接
        String s2 = "TAB";
        System.out.println(s1+s2);   //ABCTAB

        //字符串不可变
        String str1 = "hello";  //JVM虚拟机先创建字符串"hello"，然后，把字符串变量str1指向它
        str1 = "world"; //VM虚拟机先创建字符串"world"，然后，把字符串变量把字符串变量str1指向它：
        //原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。
        System.out.println(s); // 显示 world


        //空值null 引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象。
        String str2 = null; // str2是null




        //数组类型
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
//        或者
        int[] ns2 = new int[] { 68, 79, 91, 85, 62 };
        int[] ns3 = { 68, 79, 91, 85, 62 };
//        ns.length 长度

        String[] names = {"ABC", "XYZ", "zoo"};
        String str3 = names[1];
        names[1] = "cat";
        System.out.println(str3); // "XYZ"  同js引用数据类型，改变的是数据的新建的引用，而原位置及引用依然存在。

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
 * 非基本数据类型:
 * 字符串类型:string(双引号)
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
 * 浮点数0.1在计算机中就无法精确表示，因为十进制的0.1换算成二进制是一个无限循环小数。
 * 很显然，无论使用float还是double，都只能存储一个0.1的近似值。
 * 因此，浮点数运算会产生误差：！！！
 */

/**
 * //布尔值，三目运算等同js
 *
 */
