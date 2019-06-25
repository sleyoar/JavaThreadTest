package ThreadWork20190625.work4;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        Thread t1=new Thread(mt);
        t1.start();
    }
}
