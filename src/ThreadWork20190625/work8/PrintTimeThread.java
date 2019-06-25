package ThreadWork20190625.work8;

public class PrintTimeThread extends Thread {
    @Override
    public void run() {
        int time = 60;
        while (true) {
            if (time > 0) {
                try {
                    Thread.sleep(3000);
                    time -= 3;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("还剩" + time + "秒");
            } else {
                System.out.println("TIME OVER!!!");
                break;
            }
        }
    }

    public static void main(String[] args){
        PrintTimeThread pt=new PrintTimeThread();
        Thread t1=new Thread(pt);
        t1.start();
    }
}
