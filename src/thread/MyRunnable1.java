package thread;

public class MyRunnable1 implements  Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("兔子领先了，乌龟要加油");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
