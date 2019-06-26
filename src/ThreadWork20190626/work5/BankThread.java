package ThreadWork20190626.work5;
class AThread extends Thread {
    public void run() {
        int amt = BankThread.ATM_total;
        try {
            this.sleep(2000);
            System.out.println("余额：" + amt);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        amt += 100;
        BankThread.ATM_total = amt;
        System.out.println("余额：" + amt);
        try {
            this.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BThread extends Thread {
    public void run() {
        int amt = BankThread.ATM_total;
        try {
            this.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (amt > 50) {
            amt -= 50;
            System.out.println("余额："+amt);
        } else {
            System.out.println("余额不足");
        }
        BankThread.ATM_total = amt;
        try {
            this.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class BankThread {
    public static int ATM_total = 200;

    public static void main(String[] args) {
        AThread aThread=new AThread();
        aThread.start();
        BThread bThread=new BThread();
        try {
            aThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bThread.start();
    }
}
