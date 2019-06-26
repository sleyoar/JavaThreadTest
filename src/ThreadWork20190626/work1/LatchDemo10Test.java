package ThreadWork20190626.work1;
import java.util.concurrent.CountDownLatch;

public class LatchDemo10Test {
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(10);
        LatchDemo10 id=new LatchDemo10(latch);
        for(int i=0;i<10;i++){
            new Thread(id,"person"+i).start();
        }
    }
}
