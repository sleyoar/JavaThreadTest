package ThreadWork20190625.work2;
import java.util.Date;
public class TimeThreadTest extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        TimeThreadTest t1=new TimeThreadTest();
        t1.start();
    }
}
