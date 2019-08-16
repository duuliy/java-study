package test;

import java.io.*;
import java.util.Arrays;

public class fileTest {
    public static void main(String[] args) throws IOException {
        File file=new File("F:\\fileTest\\hello\\hello.txt","文件.txt"); //命名
//        File file=new File("F:\\fileTest\\hello.txt"); //c创建文件或文件夹
//        boolean newFile= file.createNewFile();
//        boolean mkdir= file.mkdir(); //只能创建最后一层
//        boolean mkdir= file.mkdirs(); //多及目录创建
//        System.out.println(mkdir);
//        boolean delete=file.delete(); //删除最后一层，不走回收站,文件直接删，但是文件夹只有空的才能删。
//        System.out.println(newFile);

//        String absolution=file.getAbsolutePath(); //绝对路径
//        File file=new File("hello.txt"); //相对路径
//        String path=file.getPath(); //相对路径
//        System.out.println(path);

        Reader reader=null;
//        File file1=new File("Reader.java");
        Writer writer=null;  //写

//        reader=new FileReader(file);  //读  拷贝

        char[] cs=new char[1024];
        int len =-1;
//        while((len=reader.read(cs))!=-1){
//            System.out.println(new String(cs,0,len));
//        }

        //编码
        String str="duuliy";
        byte[] bytes=str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));
        String s=new String(bytes,"UTf-8");
        System.out.println(s);

    }

    public static void parseFile(File file){  //递归获取
        if(file==null|file.exists()){
            return;
        }
        File[] files=file.listFiles();
        for(File f:files){
            System.out.println(f.getName());
            if(f.isDirectory()) {
                parseFile(f);
            }
        }
    }

}


/**
 * 文件操作
 * getPath(); 相对路径
 * getName() 文件名字
 * length() 文件大小 bt
 * lastModofied() 最后修改时间  时间戳
 * listRoots() 电脑磁盘的根目录
 * listFiles() 获得文件夹下所有子目录对象
 * list() 获取子文件名字
 *
 * */

/**
 * 文件的判断
 *
 * 返回值都是boolean:
 *
 * exists() 表示文件或目录是否存在
 * isFile()  是否是一个文件
 * isDirectory() 是否是一个目录
 * isAbsolute() 是否是绝对路径
 * */


/**
 * 文件拷贝
 *
 * */

/**
 * 字符操作（文本）：
 *
 * BufferReader  读
 * BufferWriter  写
 * 然后装入文件
 *
 * 扩展使用，查
 *
 * 字节流（二进制）：
 * InputStream:输入流 常用子类FileInputStream 读
 * OutputStream:输出流 常用子类FileOutputStream 写
 * 然后装入文件
 *
 * 字符和字节转换
 * OutputStreamWriter 字符流转换成字节流
 * InputStreamReader 字节流转换成字符流
 *
 * */

/**
 * 打印流：
 * printWriter() 括号里面加System.out  打印到控制台
 * println()
 * */

/**
 * 序列化(把对象以流的形式存续在硬盘或者数据库中):
 * 继承Serializable 才能序列化
 * 输出ObjectOutputStream  写入OutputStream
 * 输入ObjectInputStream  ObjectOutputStream反序列化
 * 多个对象序列化需要放在队列中
 *
 * */

/**
 * 字符串编码与解码
 * getBytes 编码
 * new String(bytes,"UTf-8") 解码
 *
 * */