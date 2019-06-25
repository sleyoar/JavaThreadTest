package lifecycle;

public class SleepThread  extends Thread {

    @Override
    public void run() {
        while(true){
            System.out.println("每隔一秒输出");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
