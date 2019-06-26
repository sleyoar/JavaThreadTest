package ThreadWork20190626.work5;

public class ATM extends Thread {
    public static void main(String args[]) {
        AThread aThread = new AThread();
        aThread.start();
        BThread bThread = new BThread();
        bThread.start();
    }
}
