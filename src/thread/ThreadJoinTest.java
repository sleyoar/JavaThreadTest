package thread;

public class ThreadJoinTest {
    public static void main(String[] args) {
    }
    class MyThread1 extends Thread {

        @Override
        public void run() {
            try {
                //t1启动
                System.out.println(Thread.currentThread().getName() + "启动");

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + "停止");
            }
        }

    }

    class MyThread2 extends Thread {

        @Override
        public void run() {
            try {
                //启动t1,让t2等待t1执行完成
                Thread t1 = new Thread(new MyThread1());
                t1.setName("线程1");
                t1.start();
                t1.join();

                //t2启动
                System.out.println(Thread.currentThread().getName() + "启动");

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + "停止");
            }
        }

    }

    class MyThread3 extends Thread {

        @Override
        public void run() {
            try {
                //启动t2,让t3等待t2执行完成
                MyThread2 t2 = new MyThread2();
                t2.setName("线程2");
                t2.start();
                t2.join();

                //启动t3
                System.out.println(Thread.currentThread().getName() + "启动");

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + "停止");
            }
        }
    }
}

/*---------------------
        作者：Hurricane_m
        来源：CSDN
        原文：https://blog.csdn.net/Hurricane_m/article/details/89469049
        版权声明：本文为博主原创文章，转载请附上博文链接！
}*/
