package test;

public class DownLoad implements Runnable{

    private String name;

    public DownLoad(String name){
        this.name=name;
    }


    @Override
    public void  run(){
        for(int i=1;i<100;i++){
            System.out.println(this.name+"下载了"+i+"%");
        }
    }
}
