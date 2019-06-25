package ThreadWork20190625.work5;

public class MainThread extends Thread {

    public static void main(String[] args) {
        String name=Thread.currentThread().getName();
        System.out.println(name+" begin running......");
        //创建进程对象
        MainThread thread=new MainThread();
        NewThread thread1=new NewThread();
        Thread thread2=new Thread(thread1);
        //启动线程
        thread.start();
        thread2.start();
        for (int i=1;i<=100;i++){
            System.out.println("Thread :"+name+" is printing"+i);
        }
        System.out.println(name+" finished!");
    }
}
