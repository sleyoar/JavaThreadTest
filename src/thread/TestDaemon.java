package thread;

public class TestDaemon {

    public static void main(String[] args) {
        DaemonThread dt=new DaemonThread();
        dt.setDaemon(true);//设置为守护线程
        dt.start();//设置守护线程在启动之前
        System.out.println("当前线程为："+Thread.currentThread().getName()+"在执行");
        System.out.println(dt.isDaemon());//去判断线程是否是守护线程

    }
}
