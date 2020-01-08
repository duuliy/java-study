package test;

public class MyThread extends Thread {

    private String name;
//
//    private Basket basket;

    static Object obj=new Object();

    public MyThread(String name){
        this.name=name;
    }


    @Override
    public void  run(){
        for(int i=1;i<100;i++){
            synchronized(obj){ //锁
                System.out.println(this.name+"下载了"+i+"%");
//                try {

//                    obj.wait();  //线程等待状态
//                    obj.notify(); //通知其他线程
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    public static synchronized void saleTickets(){
//
//    } 锁的另一种方式

}


/**
 *
 * 获取线程名字this.getName()
 *
 *
 * sleep()沉睡100ms  每次
 * */

