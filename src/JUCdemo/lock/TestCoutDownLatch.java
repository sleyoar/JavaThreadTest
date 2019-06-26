package JUCdemo.lock;

import java.util.concurrent.CountDownLatch;

public class TestCoutDownLatch {

    public static void main(String[] args) {

        //闭锁参数是指线程数
        CountDownLatch cd=new CountDownLatch(5);
        MyRunnable mr=new MyRunnable(cd);
        long start=System.currentTimeMillis();
        //多条线程并发执行
        for(int i=0;i<cd.getCount();i++){

            new Thread(mr).start();
        }
        try {
            cd.await();//让主线程阻塞
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println("总共了花费了"+(end-start));
    }
}
