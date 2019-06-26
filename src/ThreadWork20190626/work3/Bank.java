package ThreadWork20190626.work3;

public class Bank {
    private static int balance=0;
    public synchronized static void take(int money){
        int temp=balance;
        temp+=money;
        try {
            Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance=temp;
        System.out.println(Thread.currentThread().getName()+"存钱，余额："+balance);
    }
}
