package thread;

public class TestHand {

    public static void main(String[] args) {
        LeftThread left=new LeftThread();
        RightHand right=new RightHand();
        left.start();//等待cpu调度等待资源，需要时间
        //left.start();//启动第二次，启动两次会抛出IllegalThreadStateException
        //right.start();
        right.run();//使用run方法代替的start启动方法
        for(int i=1;i<=5;i++) {
            System.out.println("当前线程："+Thread.currentThread().getName()+"执行");
        }


    }
}
