/*
package ThreadWork20190626.work5;

public class AThread extends Thread {
    public void run() {
        int amt = Prm.ATM_total;
        try {
            this.sleep(2000);
            System.out.println("余额：" + amt);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        amt += 100;
        Prm.ATM_total = amt;
        System.out.println("余额：" + amt);
        try {
            this.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/
