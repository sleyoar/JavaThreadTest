package JUCdemo.lock;

import java.util.concurrent.Semaphore;

/**
 * 技术信号量用来控制能够同时访问某特定资源的活动的数量，或者同时执行某一给定操作的数据。计数信号量可以用来实现资源池或者给一个容器限定边界。
 *
 * 　　信号量维护了一个许可集，许可的初始量通过构造函数传递给Semaphore。活动能够获取许可，并在使用之后释放许可，如果没有可用的许可，acquire方法会被阻塞，直到有可用的为止。每个release方法添加一个许可，从而可能释放一个正在阻塞的获取者。
 *
 * 　　计算信号量的一种退化形式是二元信号量：一个计数初始值为1的Semaphore，二元信号量可用作互斥锁。
 *    应用场景
 *   信号量可用来实现资源池，比如数据库连接池
 *
 *   构造函数：
 *
 * 　　Semaphore(int permits)：创建具有给定许可数和非公平设置的Semaphore
 *
 * 　　Semaphore(int permits，boolean fair)：此类的构造方法可选地接受一个公平 参数。当设置为 false 时，此类不对线程获取许可的顺序做任何保证。特别地，闯入是允许的，也就是说可以在已经等待的线程前为调用 acquire() 的线程分配一个许可，从逻辑上说，就是新线程将自己置于等待线程队列的头部。当公平设置为 true 时，信号量保证对于任何调用获取方法的线程而言，都按照处理它们调用这些方法的顺序（即先进先出；FIFO）来选择线程、获得许可。注意，FIFO 排序必然应用到这些方法内的指定内部执行点。所以，可能某个线程先于另一个线程调用了 acquire，但是却在该线程之后到达排序点，并且从方法返回时也类似。
 *
 * 　　Semaphore还提供一些其他方法：
 *
 * int availablePermits() ：返回此信号量中当前可用的许可证数。
 * int getQueueLength()：返回正在等待获取许可证的线程数。
 * boolean hasQueuedThreads() ：是否有线程正在等待获取许可证。
 * void reducePermits(int reduction) ：减少reduction个许可证。是个protected方法。
 * Collection getQueuedThreads() ：返回所有等待获取许可证的线程集合。是个protected方法。
 */
public class SemaphoreTest {
    public static void main(String[] args)
    {
        Semaphore semaphore=new Semaphore(3);
        for(int i=0;i<5;i++)
        {
            MyThread myThread=new MyThread("线程"+i, semaphore);
            myThread.start();
        }
    }

    static class MyThread extends Thread
    {
        String name;
        Semaphore semaphore;
        public MyThread(String name,Semaphore semaphore)
        {
            this.name=name;
            this.semaphore=semaphore;
        }
        @Override
        public void run()
        {
            try
            {
                semaphore.acquire();
                System.out.println(name+"获取信号量，开始工作...");
                Thread.sleep(3000);
                System.out.println(name+"工作结束"+"，正在等待获取许可证的线程数："+semaphore.getQueueLength());
            }
            catch (InterruptedException e)
            {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
            finally
            {
                semaphore.release();
            }
        }
    }
}
