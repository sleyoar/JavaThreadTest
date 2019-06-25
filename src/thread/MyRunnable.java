package thread;

public class MyRunnable implements  Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("乌龟领先了，兔子要加油");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
