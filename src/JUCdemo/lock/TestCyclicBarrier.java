package JUCdemo.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 栅栏类似闭锁,但是它们是有区别的.
 *
 * 1.闭锁用来等待事件，而栅栏用于等待其他线程.什么意思呢?就是说闭锁用来等待的事件就是countDown事件,只有该countDown事件执行后所有之前在等待的线程才有可能继续执行;而栅栏没有类似countDown事件控制线程的执行,只有线程的await方法能控制等待的线程执行.
 *
 * 2.CyclicBarrier强调的是n个线程，大家相互等待，只要有一个没完成，所有人都得等着。
 */
 class CyclicBarrierWorker implements  Runnable {
    private int id;
    private CyclicBarrier barrier;

    public CyclicBarrierWorker(int id, final CyclicBarrier barrier) {
        this.id = id;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            System.out.println(id + " th people wait");
            barrier.await(); // 大家等待最后一个线程到达
        } catch (InterruptedException | BrokenBarrierException e) {

            e.printStackTrace();
        }
    }
}

public class TestCyclicBarrier {
    public static void main(String[] args) {
        int num = 10;
        CyclicBarrier barrier = new CyclicBarrier(num, new Runnable() {
            @Override
            public void run() {

                System.out.println("go on together!");
            }
        });
        for (int i = 1; i <= num; i++) {
            new Thread(new CyclicBarrierWorker(i, barrier)).start();
        }
        //System.out.println("最后结束");
    }
}
