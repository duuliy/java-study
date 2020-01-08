package test;

import java.util.Arrays;

public class parameter {
    public static void main(String[] args) {
        String cc=add(new String[]{"duuliy","张飞"});
        System.out.println(cc);
        String cc2=add("duuliy","张飞2");
        System.out.println(cc2);
    }

    public static String add(String  ...a){
        String total="";
        for (int i=0;i<a.length;i++){
            total=total+a[i];
        }
        return total;
    }
}

/**
 * 可变参数
 *
 * */
