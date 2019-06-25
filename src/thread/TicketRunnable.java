package thread;

public class TicketRunnable implements Runnable {
    private int tickets=5;
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            if(tickets>0){
                try {
                    Thread.sleep(300);
                    System.out.println("Thread :"+Thread.currentThread().getName()+" is selling"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketRunnable tick=new TicketRunnable();
        Thread t1=new Thread(tick,"Win 1");
        Thread t2=new Thread(tick,"Win 2");
        Thread t3=new Thread(tick,"Win 3");
        t1.start();t2.start();t3.start();

    }
}
