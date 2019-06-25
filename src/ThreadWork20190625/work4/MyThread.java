package ThreadWork20190625.work4;
import java.util.Random;
public class MyThread extends Thread {
    @Override
    public void run() {
        int times=0;
        for(int i=0;i<3;i++){
            long rt=new Random().nextInt(1000);
            try{
                times++;
                Thread.sleep(rt);
                System.out.println("Thread: "+Thread.currentThread().getName()+" Times: "+rt+"次数"+times);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
