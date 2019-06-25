package lifecycle;

public class JoinDemo {

    public static void main(String[] args) {
        final Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 is running");
            }
        });
        final Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                //t2要在t1之后执行
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("t2 is running");
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                //t3要在t2之后执行
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("t3 is running");
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
