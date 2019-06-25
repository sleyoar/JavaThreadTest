package ThreadWork20190625.work9;
public class BookingClerk {
    int remainder=10;
    void booking(int num) {
        synchronized (this) {
            if (num < remainder) {
                System.out.println("预定" + num + "张");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                remainder = remainder - num;
            } else {
                System.out.println("剩余票不够，无法预定");
            }
            System.out.println("还剩" + remainder + "张票");
        }
    }
}
