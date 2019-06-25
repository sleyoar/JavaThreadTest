package lifecycle;

public class InterruptThread extends Thread {
    public InterruptThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"写代码好累，在睡觉");
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            System.out.println("谁吵醒了"+Thread.currentThread().getName());
            e.printStackTrace();
        }finally {
            System.out.println("睡醒了之后继续敲代码");
        }

    }

    public static void main(String[] args) {
        InterruptThread it = new InterruptThread("张三");
       // InterruptThread it1 = new InterruptThread("李四");
        it.start();
       // it1.start();

       // it.interrupt();//中断休眠
       // it1.interrupt();
    }
}
