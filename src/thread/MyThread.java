package thread;

public class MyThread extends Thread {
    public void run(){
        for(int i=0;i<=90;i++){
            System.out.println("Thread :"+getName()+" is printing"+i);
        }
    }

    public static void main(String[] args) {
        //获取当前线程名字
        String name=Thread.currentThread().getName();
        System.out.println(name+" begin running......");
        //创建进程对象
        MyThread thread=new MyThread();
        //启动线程
        thread.start();
        for (int i=1;i<=100;i++){
            System.out.println("Thread :"+name+" is printing"+i);
        }
        System.out.println(name+" finished!");
    }
}
