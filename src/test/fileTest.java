package test;

import java.io.File;
import java.io.IOException;

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
        String path=file.getPath(); //相对路径
        System.out.println(path);

    }

    public static void parseFile(File file){
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