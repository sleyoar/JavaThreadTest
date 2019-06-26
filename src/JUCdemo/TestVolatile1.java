package JUCdemo;
/*
 * 一、volatile 关键字：当多个线程进行操作共享数据时，可以保证内存中的数据可见。
 * 	相较于 synchronized 是一种较为轻量级的同步策略。
 *
 * 注意：
 * 1. volatile 不具备“互斥性”
 * 2. volatile 不能保证变量的“原子性”
 */
public class TestVolatile1 implements  Runnable {

    private volatile   boolean flag=false;//flag变量使用volatile
    @Override
    public void run() {
        try {
            Thread.sleep(300);
            flag=true;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("flag=" + flag);

    }


    public boolean isFlag() {
        return flag;
    }


    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    public static void main(String[] args) {
        TestVolatile1 tv=new TestVolatile1();
        Thread t=new Thread(tv);
        t.start();
        while(true) {
                 if(tv.isFlag()){
                System.out.println("------------------");
                break;
            }
        }
    }
}
