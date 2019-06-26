package ThreadWork20190626.work1;
import java.util.concurrent.CountDownLatch;
public class LatchDemo10 implements Runnable {
    private CountDownLatch latch;

    public LatchDemo10(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"正在进洞");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println(Thread.currentThread().getName()+"通过山洞");
                latch.countDown();
            }
        }
    }
}
