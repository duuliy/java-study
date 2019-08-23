package test;

public class threadProcess{
    public static void main(String[] args) throws InterruptedException {
        //实现线程的方法1
//        MyThread mt=new MyThread("duuliy");
//        mt.start();
//
//        MyThread mt1=new MyThread("张飞");
//        mt1.start();
//        System.out.println("方法结束");

        //实现线程的方法2
        Thread t= new Thread(new DownLoad("duuliy"));
        Thread t1= new Thread(new DownLoad("duuliy2"));
        Thread t2= new Thread(new DownLoad("duuliy3"));
//        t.setPriority(Thread.MAX_PRIORITY); //设置最高优先级
        t.start();
//        t2.join();    //加入某层的线程  优先级
        t1.start();
        t1.setDaemon(true);
        t2.start();

}


}


/**
 * 线程Thread
 * DownLoad和MyThread文件一起
 *
 * 阻塞 Sleep() notify() Wait()
 *
 * */

/**
 * 并发（比如抢票）
 *
 * 并发解决方法：
 * synchronized 锁
 * */


/**
 * 线程优先级
 *
 * t.setPriority(Thread.MAX_PRIORITY); //设置最高优先级，得到最多的cpu
 *
 * */

/**
 * 加入线程
 *  t2.join();    //加入某层的线程  优先级  不能放在第一个
 *
 * */

/**
 * 让出线程
 * Thread.yield() 类似es6的genious
 *
 * 守护线程
 * t.setDaemon(true)  //主线程结束就结束子线程
 *
 *
 * */

/**
 * 死锁
 * 走不下去了 一直运行了
 *
 * */