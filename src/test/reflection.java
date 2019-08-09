package test;

public class reflection {
    public static void main(String[] args) {

        Number n = new Double(123.456); // OK
//        String s = new Double(123.456); // compile error!
        Number n1=6566;

        Class cls = String.class;
        System.out.println(cls);
        String s = "Hello";
        Class cls2 = s.getClass();
        System.out.println(cls2);
//        Class cls3 = Class.forName("java.lang.String");
    }
}


/**
 * 反射(相当于按需加载):
 * 指程序在运行期可以拿到一个对象的所有信息。
 * 通过Class实例获取class信息的方法称为反射（Reflection）;
 * JVM总是动态加载class，可以在运行期根据条件来控制加载class。
 *
 * */