package test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Generic {
    static {
        System.out.println("777");
    }
    public  static  void  main(String[] arg) throws ParseException {
        Date d= new Date();
        System.out.println(d); //时间
        System.out.println(d.getTime()); //获取毫秒数 时间戳

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS E"); //最后毫秒数 星期
        System.out.println(sdf.format(d)); //时间 年月日
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS E");
        System.out.println(sdf2.format(d));
        String s="1994-01-25 12:34:22:390 星期二";
        System.out.println(sdf.parse(s));


        class ArrayList<T> {
            private T[] array;
            private int size;
//            public void add(T e) {...}
//            public void remove(int index) {...}
//            public T get(int index) {...}
        }
        ArrayList<String> strList = new ArrayList<String>(); //这样才能发挥泛型优势指定类型
//        strList.add("hello"); // OK
//        String s = strList.get(0); // OK
//        strList.add(new Integer(123)); // compile error!
//        Integer n = strList.get(0); // compile error!

        class Pair<T,K> {
            private T[] array;
            private K array2;

            public Pair(T array, K array2) {
                this.array = (T[]) array;

                this.array2 = array2;
            }
        }
        String[] names = {"Bob", "Alice", "Grace"};
        Pair<String[], Integer> p = new Pair<>(names, 123);
        System.out.println(p);

//        class Pair<T extends Number> {
//
//        }
    }
}


/**
 *
 * static 此处用于资源初始化
 *
 * 泛型
 * 这里就和ts非常类似了
 * 它可以向上转型
 * 如果不定义泛型类型时，泛型类型实际上就是Object
 *
 * 局限：
 * 1.<T>不能是基本类型，例如int，因为实际类型是Object，Object类型无法持有基本类型
 * 2.无法取得带泛型的Class。
 * 3.无法判断带泛型的Class。
 * 4.不能实例化T类型
 *
 *
 *
 *
 * */

/**
 * extends 和super通配符
 * 一个类可以继承自一个泛型类。
 *  使用extends通配符表示可以读，不能写。
 *  Pair<Integer>不是Pair<Number>的子类。
 *
 *
 *  即使用super通配符表示只能写不能读。
 *
 *  同时使用泛型和可变参数时需要特别小心！！！
 * */