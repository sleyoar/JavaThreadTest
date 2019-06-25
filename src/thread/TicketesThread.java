package thread;
//继承Thread方式不能共享数据，各自独立的一份拷贝数据
public class TicketesThread extends  Thread {
    private int tickets=5;//共享数据5张火车票
    public TicketesThread(String name){
        super(name);
    }
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
