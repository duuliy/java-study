package test;

import java.util.Arrays;

public class objOriented {

    private static boolean somebody(int a, int b) {
        boolean boo = true;
        if (a > b) {
            boo = false;
        } else if (a < b) {
            boo = true;
        }
        return boo;
    }

    public static void main(String[] args) {
        System.out.println(somebody(1, 2));

        String [] arr={"duuliy", "赵日天", "张飞"};
        Person ming = new Person(arr,18);
     /*   ming.setName("duuliy", "赵日天", "张飞"); // 设置name
        ming.setAge(18); // 设置age*/
        System.out.println(ming.getName() + ", " + ming.getAge());
        String[] fullname = new String[] { "Homer", "Simpson" };
        String[] copeName= Arrays.copyOf(fullname,fullname.length); //深拷贝处理(一层)
        ming.setName2(copeName);
        fullname[0] = "Bart";
        System.out.println(ming.getName());
    }
}

class Person {
    private String[] name;
    private int      age;

    //这样可以 new的时候就传入参数
    public Person(String[] name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return Arrays.toString(this.name);
    }

    public void setName(String... name) {
        this.name = name;
    }

    public void setName2(String[] name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        try {
            Person person = (Person) super.clone();
            person.name = Arrays.copyOf(name,name.length);//深拷贝处理(一层)
            return person;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}



/**
 * 面向对象 class和new大致同js 两个instance拥有class定义的name和age字段，且各自都有一份独立的数据，互不干扰。
 *
 */