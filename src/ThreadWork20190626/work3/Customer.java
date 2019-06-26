package ThreadWork20190626.work3;

public class Customer extends Thread {
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            Bank.take(100);
        }
    }
}
