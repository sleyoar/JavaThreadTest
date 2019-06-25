package ThreadWork20190625.work3;

public class ThreadDemoTest {
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo("asd",1000);
        t1.start();
        ThreadDemo t2=new ThreadDemo("sad",2000);
        t2.start();
        ThreadDemo t3=new ThreadDemo("das",999);
        t3.start();
    }
}
