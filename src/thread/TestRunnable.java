package thread;

public class TestRunnable {

    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        MyRunnable1 mr1=new MyRunnable1();
        Thread t=new Thread(mr,"乌龟");
        Thread t1=new Thread(mr1,"兔子");
        t.start();
        t1.start();

    }
}
