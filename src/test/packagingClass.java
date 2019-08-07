package test;

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

class Weekday {  //枚举
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;
}

enum Weekday {
    SUN(0),
    MON(0),
    TUE(0),
    WED(0),
    THU(0),
    FRI(0),
    SAT(0);

    Weekday(int a){
        this.a=a;
    }

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
 * */