package JUCdemo.commincation;

public class TicketsHouse implements  Runnable {
    int fiveAmount = 1;//5块钱的个数
    int tenAmount = 0;
    int twentyAmount = 0;//20块钱的个数

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("张飞")) {
            saleTicket(20);
        } else if (Thread.currentThread().getName().equals("关羽")) {
            saleTicket(5);
        } else if (Thread.currentThread().getName().equals("刘备")) {
            saleTicket(5);
        }

    }

    //同步 wait() notify() notifyalll()都是Object类的方法
    private synchronized void saleTicket(int money) {
        if (money == 5) {
            fiveAmount += 1;
            System.out.println(
                    "给" + Thread.currentThread().getName() + "入场券" + Thread.currentThread().getName() + "的钱正好");
        } else if (money == 20) {
            while (fiveAmount < 3) {
                try {
                    System.out.println("\n" + Thread.currentThread().getName() + "靠边等");
                    wait();//零钱，卖票人只能等待
                    System.out.println("\n" + Thread.currentThread().getName() + "继续买票");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            fiveAmount -= 3;//找零15元
            tenAmount += 1;//20元一张
            System.out.println(
                    "给" + Thread.currentThread().getName() + "入场券" + Thread.currentThread().getName() + "给20，找零15元");
        }
        notifyAll();
    }
}
