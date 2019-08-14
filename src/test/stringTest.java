package test;
import java.util.StringJoiner;

public class stringTest {
    public static void main(String[] args) {
        String s = "1";
        for (int i = 0; i < 10; i++) {
            s = s + "," + i;
        }
        System.out.println(s);

        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 10; i++) {
            sb.append(',').append(i).append('p');
        }
        String sb2 = sb.toString();
        System.out.println(sb2);

        String[] names = {"Bob", "Alice", "Grace"};
        StringJoiner sj = new StringJoiner(", ", "", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());

        String str5 = String.join("! ", names);
        System.out.println(str5);
    }
}

/**
 *
 * StringBuilder:
 * 虽然可以直接拼接字符串，但是，在循环中，每次循环都会创建新的字符串对象，然后扔掉旧的字符串。这样，绝大部分字符串都是临时对象，不但浪费内存，还会影响GC效率。
 * StringBuilder它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象：
 *
 * 注意：对于普通的字符串+操作，并不需要我们将其改写为StringBuilder，因为Java编译器在编译时就自动把多个连续的+操作编码为StringConcatFactory的操作。在运行期，StringConcatFactory会自动把字符串连接操作优化为数组复制或者StringBuilder操作。
 * 你可能还听说过StringBuffer，这是Java早期的一个StringBuilder的线程安全版本，它通过同步来保证多个线程操作StringBuffer也是安全的，但是同步会带来执行速度的下降。
 *
 * StringBuilder和StringBuffer接口完全相同，现在完全没有必要使用StringBuffer。
 *
 * */

/**
 * StringJoiner:
 * 类似用分隔符拼接数组的需求很常见，所以Java标准库还提供了一个StringJoiner来干这个事：
 *
 * String.join()
 * 在不需要指定“开头”和“结尾”的时候，用String.join()更方便：
 * 最后一个数组不会拼接指定字符，原理同+ ','一样
 *
 * */
