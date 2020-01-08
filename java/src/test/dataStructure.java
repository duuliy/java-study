package test;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.asList;

public class dataStructure {
    public static void main(String[] args) {

//        Map的一般用法:
//        1.声明一个Map :
        Map map = new HashMap();
//        2 .向map中放值 ，注意： map是key-value的形式存放的，如：
        map.put("sa","dd");
//        3 .从map中取值 :
        String str = map.get("sa").toString();
//        结果是： str = "dd'
//        4 .遍历一个map,从中取得key和value :
        Map m= new HashMap();
        for(Object obj : map.keySet()){
            Object value = map.get(obj );
            System.out.println(value);
        }
        //想一次性加很多智能循环


        //        set的一般用法:
        Set set=new HashSet();
        String s1=new String("hello");
        String s2=s1;
        String s3=new String("world");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
        System.out.println(set.size());//打印集合中对象的数目 为 2。

        //想一次性加很多智能循环


        //list

        List list =new ArrayList();
        list.add("duuliy");
        System.out.println(list);
        List<String> strings = new ArrayList(asList("foo", "bar", "baz"));
        System.out.println(strings);

        List<String> strings1 = new Vector(asList("foo", "bar2", "baz"));
        System.out.println(strings1);

        List<String> strings2 = new LinkedList(asList("foo", "bar3", "baz"));
        System.out.println(strings2);

    }
}


/**
 * java数据结构：
 * 不包括json对象。
 *
 * java.util包中三个重要的接口及特点：
 * List（列表）：
 * ArrayList、Vector是线性表，使其容量可以动态增长
 * ArrayList是非同步的，Vector是同步的。
 * LinkedList是链表，略懂数据结构就知道其实现原理了。链表随机位置插入、删除数据时比线性表快，遍历比线性表慢。
 *
 * 默认添加：list.add(e);
 * 指定下标添加（添加后下标后的元素向后挪一位）：list.add(index,e);
 *
 * 返回是否删除：list.remove(e);
 * 直接删除指定下标的元素（只删除找到的第一个相符合的元素）：list.remove(index);
 *
 * 替换元素（替换掉指定下标的元素）：list.set(index,e);
 *
 * 取出元素：list.get(index);
 *
 * 清空集合：list.clear();
 *
 * 判断集合中是否存在某个元素（存在返回true，不存在返回false）：list.contains(e);
 *
 * 获得元素下标：
 * 元素存在则返回找到的第一个元素的下标，不存在则返回-1：list.indexOf(e);
 * 元素存在则返回找到的最后一个元素的下标，不存在则返回-1：list.lastIndexOf(e);
 *
 * 判断集合是否为空（空则返回true，非空则返回false）：list.isEmpty();
 *
 * 将集合转换为字符串：list.toString();
 *
 * 截取集合（从fromIndex开始在toIndex前结束，[fromIndex,toIndex)）：list.subList(fromIndex,toIndex);
 *
 * 将集合转换为数组：
 * 默认类型：list.toArray();
 * 指定类型（objects为指定类型的数组对象，并将转换好的数组赋值给objects数组）：list.toArray(objects);
 *
 * */



 /**
 * Set（保证集合中元素唯一,相当于js的数组）、
 * 和js一样 可以去重
 * HashMap
 **/




 /** Map（维护多个key-value键值对，保证key唯一
 * Map（存储键值对，key唯一）
 * 分为HashMap和Hashtable
 *
 * HashMap几乎可以等价于Hashtable，除了HashMap是非synchronized的，
 * 并可以接受null(HashMap可以接受为null的键值(key)和值(value)，而Hashtable则不行)。
 *
 * HashMap是非synchronized，而Hashtable是synchronized，这意味着Hashtable是线程安全的，
 * 多个线程可以共享一个Hashtable；而如果没有正确的同步的话，多个线程是不能共享HashMap的。
 * Java 5提供了ConcurrentHashMap，它是HashTable的替代，比HashTable的扩展性更好。
 *
 *
 * HashMap不能保证随着时间的推移Map中的元素次序是不变的。
 *
 * */
