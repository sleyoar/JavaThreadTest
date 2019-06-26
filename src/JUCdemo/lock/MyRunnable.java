package JUCdemo.lock;

import java.util.concurrent.CountDownLatch;

public class MyRunnable  implements Runnable {
    private CountDownLatch cd;
    public MyRunnable(CountDownLatch cd){
        this.cd=cd;
    }

    @Override
    public void run() {
        //计算2-1000之间所有偶数
        synchronized (this){
            try{
                for(int i=2;i<1000;i++){
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+"获取的偶数："+i);
                }
            }

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                cd.countDown();//减掉锁的数目
            }


        }

    }
}
