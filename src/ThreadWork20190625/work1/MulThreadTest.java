package ThreadWork20190625.work1;
public class MulThreadTest {
    public static void main(String[] args) {
        MulThread m1=new MulThread("gg");
        MulThread m2=new MulThread("gg2");
        MulThread m3=new MulThread("gg3");
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        Thread t3=new Thread(m3);
        t1.start();t2.start();t3.start();
    }
}
