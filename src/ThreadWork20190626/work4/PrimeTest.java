package ThreadWork20190626.work4;

public class PrimeTest {
    public static void main(String[] args) {
        Thread t1=new Thread(new PrimeThread(1,1000,null),"线程1");
        Thread t2=new Thread(new PrimeThread(1001,2000,t1),"线程2");
        Thread t3=new Thread(new PrimeThread(2001,3000,t2),"线程3");
        t1.start();
        t2.start();
        t3.start();
    }
}

