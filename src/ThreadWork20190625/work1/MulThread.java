package ThreadWork20190625.work1;
import java.util.Random;
public class MulThread extends Thread {
    private long delay;
    public MulThread(String name) {
        super(name);
         delay=(long)new Random().nextInt(1000);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(this.getName()+" is running"+" delay is "+delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(this.getName()+" is finished !");
        }
    }
}
