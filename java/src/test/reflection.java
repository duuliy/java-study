package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class reflection {
    public static void main(String[] args) throws NoSuchFieldException,IllegalAccessException,NoSuchMethodException,InvocationTargetException,InstantiationException{

        Number n = new Double(123.456); // OK
//        String s = new Double(123.456); // compile error!
        Number n1=6566;

        Class cls = String.class;
        System.out.println(cls);
        String s = "Hello";
        Class cls2 = s.getClass();
        System.out.println(cls2);
//        Class cls3 = Class.forName("java.lang.String");

        Class stdClass = student.class;
        person2 p = new person2("duuliy");
        Class c=p.getClass();
        Field f = c.getDeclaredField("name");
        Field fied=stdClass.getField("score");
//        Field fied2=p.getField("score");
        f.setAccessible(true);

        // 获取public字段
        System.out.println(fied);
//        System.out.println(student.class.getField("score2"));
        System.out.println(stdClass.getFields());
        f.set(p, "Xiao Hong");
        System.out.println(p.getName());

        Method h=person.class.getMethod("hello");
        System.out.println(h.invoke(new person()));

        Method m = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果:
        Integer nm = (Integer) m.invoke(null, "12345");
        System.out.println(nm);

        Constructor cons1 = person3.class.getConstructor(String.class);
        person3 n11 = (person3) cons1.newInstance("123"); //初始化
        System.out.println(n11.getName());


        Class i = Integer.class.getSuperclass();
        Class ni = i.getSuperclass();
        Class[] is = i.getInterfaces(); //获取接口
        System.out.println(ni);
        for (Class i8 : is) {
            System.out.println(i8);
        }

        Object ne = Integer.valueOf(123);
        boolean isDouble = ne instanceof Double; // false

        Number.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Number


    }
}

class student extends person {
    private  int score2; //私有属性拿不到
    public int score;
    private int grade;

    public void hello() {
        System.out.println("student:hello");
    }

}

class person {
    public String name;

    public void hello() {
        System.out.println("Person:hello");
    }

}

class person2 {
    private String name;

    public person2(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class person3 {
    private String name;

    public person3(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

//动态代理  感受一下
//class HelloDynamicProxy implements Hello {
//    InvocationHandler handler;
//    public HelloDynamicProxy(InvocationHandler handler) {
//        this.handler = handler;
//    }
//    public void morning(String name) {
//        handler.invoke(
//                this,
//                Hello.class.getMethod("morning"),
//                new Object[] { name });
//    }
//}



/**
 * 反射(有点像按需加载的性质，实际上就是拿类的值):
 * 指程序在运行期可以拿到一个对象的所有信息。
 * 通过Class实例获取class信息的方法称为反射（Reflection）;
 * JVM总是动态加载class，可以在运行期根据条件来控制加载class。
 *
 * */


/**
 * 访问字段
 *
 * Field getField(name)：根据字段名获取某个public的field（包括父类）
 * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
 * Field[] getFields()：获取所有public的field（包括父类）
 * Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
 *
 * 直接通过类就可以拿到了,为什么还要这么麻烦呢??。
 *
 * setAccessible 拿到类的私有属性和方法还有构造函数
 * 调用Field.setAccessible(true)的意思是，别管这个字段是不是public，一律允许访问。
 * setAccessible(true)可能会失败。如果JVM运行期存在SecurityManager，那么它会根据规则进行检查，有可能阻止setAccessible(true)。例如，某个SecurityManager可能不允许对java和javax开头的package的类调用setAccessible(true)，这样可以保证JVM核心库的安全。
 *
 *
 * set() 设置字段名
 *
 * */


/**
 * 调用方法:
 * 类似访问字段。
 *
 * Method getMethod(name, Class...)：获取某个public的Method（包括父类）
 * Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
 * Method[] getMethods()：获取所有public的Method（包括父类）
 * Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
 *
 * invoke()调用方法,，invoke的第一个参数是对象实例，即在哪个实例上调用该方法，
 * 后面的可变参数要与方法参数一致，否则将报错
 *
 * 静态方法，第一个参数是null,无需指定对象。
 * */


/**
 * 调用构造方法
 * 如果通过反射来创建新的实例，可以调用Class提供的newInstance()方法
 * 但只能调用无参。
 *
 *
 * getConstructor(Class...)：获取某个public的Constructor；
 * getDeclaredConstructor(Class...)：获取某个Constructor；
 * getConstructors()：获取所有public的Constructor；
 * getDeclaredConstructors()：获取所有Constructor。
 * **/


/**
 * 获取继承关系
 *
 * getSuperclass()获取父类class
 * 其他任何非interface的Class都必定存在一个父类类型。
 * getInterfaces() 获取接口
 *
 * instanceof 判断一个实例是否是某个类型
 *
 * //判断向上转型是否成功
 * isAssignableFrom()
 *
 *
 * */


/**
 * 动态代理
 * 还有一种方式是动态代码，我们仍然先定义了接口Hello，但是我们并不去编写实现类，而是直接通过JDK提供的一个Proxy.newProxyInstance()创建了一个Hello接口对象。这种没有实现类但是在运行期动态创建了一个接口对象的方式，我们称为动态代码。JDK提供的动态创建接口对象的方式，就叫动态代理。
 * 很像是js高阶函数 函数式编程的方式
 *
 *
 * */