package thread;

public class LeftThread extends Thread {


    @Override
    public void run() {
       for(int i=1;i<=5;i++){
           System.out.println(Thread.currentThread().getName()+"伸出左手");
          try {
               Thread.sleep(300);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
}
