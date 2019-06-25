package thread;
//使用三个窗口模拟卖票，卖5张票
public class TicketsRunable implements Runnable {
    private int tickets=5;//共享数据5张火车票
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            synchronized (this){
                if(tickets>0){
                    try {
                        Thread.sleep(300);
                        System.out.println(Thread.currentThread().getName()+ "正在卖票" + (tickets--) + "张票");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }



        }

    }
}
