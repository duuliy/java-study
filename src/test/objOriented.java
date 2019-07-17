package test;

public class objOriented {

    public static void main(String[] args) {
        System.out.println(somebody(1,2));
    }
    public static boolean somebody(int a,int b){
        boolean boo=true;
        if(a>b){
            boo= false;
        }else if(a<b){
            boo= true;
        }
        return boo;
    }
}


/**
 * 面向对象
 * class和new大致同js
 *两个instance拥有class定义的name和age字段，且各自都有一份独立的数据，互不干扰。
 *
 * */