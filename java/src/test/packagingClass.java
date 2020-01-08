package test;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

public class packagingClass {
    public static void main(String[] args) {
        String s = null;
//        int n=null;  不行

        IntegerNum n = null;
        IntegerNum n2 = new IntegerNum(-99);
        int n3 = n2.intValue();
        System.out.println(n3);

        Integer nn = 100; // 编译器自动使用Integer.valueOf(int)
        int x = nn; // 编译器自动使用Integer.intValue()

        // int可表示的最大/最小值:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648

        // long类型占用的bit和byte数量:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)

        // 向上转型为Number:
        Number num = new Integer(999);
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int nb = num.intValue();
        long ln = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();

        Weekday2 day = Weekday2.MON;
//        Weekday6 day2 = Weekday6.SUN;
        System.out.println(Weekday2.SUN.equals("SUN")); //类型不一样
        System.out.println(Weekday6.SUN);
        System.out.println(day.getNum());
        System.out.println(day.a);
        System.out.println(Weekday2.SAT.ordinal()); //6

        BigInteger i1 = new BigInteger("1234567890");
        System.out.println(i1.pow(5)); // 5次方
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2); // 加
        System.out.println(sum);

        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd)); // 乘 15241.55677489
        BigDecimal d2 = new BigDecimal("23.456789");
        BigDecimal d3 = bd.divide(d2, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
        BigDecimal d6 = new BigDecimal("123.4567000");
        System.out.println(bd.compareTo(d6));
    }
}

class IntegerNum {
    private int value;

    public IntegerNum(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }
}

class Weekday6 {  //枚举1
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;
}

enum Weekday2 {  //枚举2
    SUN(0),
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6);

    int a;

    Weekday2(int a){
        this.a=a;
    }
    public int getNum() {  //写个返回值才能拿到具体数据，否则就是变量名,或者变量名直接.a
        return this.a;
    }
}


enum Signal{   //枚举3
    GREEN,YELLOW,RED
}





/**
 * 包装类型:
 * 实际上就和ts的type包装类一样。
 * 引用类型可以赋值为null，表示空，但基本类型不能赋值为null：
 *
 * 自动装箱和自动拆箱
 * 这种直接把int变为Integer的赋值写法，称为自动装箱
 *
 * 不变类:
 * 所有的包装类型都是不变类。
 * 绝对不能用==比较，因为Integer是引用类型，必须使用equals()
 *
 * */

/**
 * 通过enum定义的枚举类，和其他的class有什么区别？
 *
 * 答案是没有任何区别。enum定义的类型就是class，只不过它有以下几个特点：
 *
 * 定义的enum类型总是继承自java.lang.Enum，且无法被继承；
 * 只能定义出enum的实例，而无法通过new操作符创建enum的实例；
 * 定义的每个实例都是引用类型的唯一实例；
 * 可以将enum类型用于switch语句。
 * 整个类都没法继承 相当于final 了class
 *
 * 枚举3： ordinal() 可以获得相当于下标值的枚举
 * 但是为了健壮性不建议这样写，因为顺序不能改变。
 *
 * 注意：枚举类的字段也可以是非final类型，即可以在运行期修改，但是不推荐这样做！
 *
 * */


/**
 *
 * 在Java中，由CPU原生提供的整型最大范围是64位long型整数。使用long型整数可以直接通过CPU指令进行计算，速度非常快。
 * 如果我们使用的整数范围超过了long型怎么办？这个时候，就只能用软件来模拟一个大整数。java.math.BigInteger就是用来表示任意大小的整数。BigInteger内部用一个int[]数组来模拟一个非常大的整数：
 * 但缺点是速度比较慢。
 *
 * 以下方法超过限制后会丢失高位：
 * xx.longValue() 转化成long
 *
 * 转换为byte：byteValue()
 * 转换为short：shortValue()
 * 转换为int：intValue()
 * 转换为long：longValue()
 * 转换为float：floatValue()
 * 转换为double：doubleValue()
 *
 * 以下方法准确抛出，超过限制就报错：
 * intValueExact()
 * longValueExact()
 *
 * */


/**
 * 和BigInteger类似，BigDecimal可以表示一个任意大小且精度完全准确的浮点数
 * multiply() 乘
 * add() 加
 * pow() 次方
 * divide() 除
 * scale() 检查有几位小数,若返回负数，说明末尾有几个0
 *
 * 加、减、乘时，精度不会丢失，但是做除法时，存在无法除尽的情况，这时，就必须指定精度以及如何进行截断：
 *
 * 特别注意，使用equals()方法不但要求两个BigDecimal的值相等，还要求它们的scale()相等：
 * BigDecimal d1 = new BigDecimal("123.456");
 * BigDecimal d2 = new BigDecimal("123.45600");
 * 这两个不相等
 *
 * 必须使用compareTo()方法来比较，它根据两个值的大小分别返回负数、正数和0，分别表示小于、大于和等于
 * 总是使用compareTo()比较两个BigDecimal的值，不要使用equals()！
 * 它根据两个值的大小分别返回负数、正数和0，分别表示小于、大于和等于。
 *
 * */

/**
 * 常用工具类：
 * 求绝对值：
 * Math.abs(-100); // 100
 *
 * 取最大或最小值：
 * Math.max(100, 99); // 100
 * Math.min(1.2, 2.3); // 1.2
 *
 * 计算xy次方：
 * Math.pow(2, 10); // 2的10次方=1024
 *
 * 计算√x：
 * Math.sqrt(2); // 1.414...
 *
 * 计算ex次方：
 * Math.exp(2); // 7.389...
 *
 * 计算以e为底的对数：
 * Math.log(4); // 1.386...
 *
 * 计算以10为底的对数：(相当于10的2次方是100)
 * Math.log10(100); // 2
 *
 * 三角函数：
 * Math.sin(3.14); // 0.00159...
 * Math.cos(3.14); // -0.9999...
 * Math.tan(3.14); // -0.0015...
 * Math.asin(1.0); // 1.57079...
 * Math.acos(1.0); // 0.0
 *
 * 随机数（伪）：
 * Random r = new Random();
 * r.nextInt(); // 2071575453,每次都不一样
 * r.nextInt(10); // 5,生成一个[0,10)之间的int
 * r.nextLong(); // 8811649292570369305,每次都不一样
 * r.nextFloat(); // 0.54335...生成一个[0,1)之间的float
 * r.nextDouble(); // 0.3716...生成一个[0,1)之间的double
 *
 * 真随机数（真正的真随机数只能通过量子力学原理来获取）:
 * SecureRandom sr = new SecureRandom(); // 获取普通的安全随机数生成器
 * sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
 *
 * SecureRandom安全性是通过操作系统提供的安全的随机种子来生成随机数。这个种子是通过CPU的热噪声、读写磁盘的字节、网络流量等各种随机事件产生的“熵”。
 *
 *  需要使用安全随机数的时候，必须使用SecureRandom，绝不能使用Random！
 * */