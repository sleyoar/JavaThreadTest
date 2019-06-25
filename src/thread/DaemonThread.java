package thread;
/**
 在Java中有两类线程：User Thread(用户线程)、Daemon Thread(守护线程)

 用个比较通俗的比如，任何一个守护线程都是整个JVM中所有非守护线程的保姆：

 只要当前JVM实例中尚存在任何一个非守护线程没有结束，守护线程就全部工作；只有当最后一个非守护线程结束时，守护线程随着JVM一同结束工作。
 Daemon的作用是为其他线程的运行提供便利服务，守护线程最典型的应用就是 GC (垃圾回收器)，它就是一个很称职的守护者。

 User和Daemon两者几乎没有区别，唯一的不同之处就在于虚拟机的离开：如果 User Thread已经全部退出运行了，只剩下Daemon Thread存在了，虚拟机也就退出了。 因为没有了被守护者，Daemon也就没有工作可做了，也就没有继续运行程序的必要了。

 这里有几点需要注意：

 (1) thread.setDaemon(true)必须在thread.start()之前设置，否则会跑出一个IllegalThreadStateException异常。你不能把正在运行的常规线程设置为守护线程。
 (2) 在Daemon线程中产生的新线程也是Daemon的。
 (3) 不要认为所有的应用都可以分配给Daemon来进行服务，比如读写操作或者计算逻辑。


 因为你不可能知道在所有的User完成之前，Daemon是否已经完成了预期的服务任务。一旦User退出了，可能大量数据还没有来得及读入或写出，计算任务也可能多次运行结果不一样。这对程序是毁灭性的。造成这个结果理由已经说过了：一旦所有User Thread离开了，虚拟机也就退出运行了。
 */
public class DaemonThread extends   Thread {
    int i=0;
    @Override
    public void run() {
        while(true) {
            i++;
            System.out.println("检测是否存在垃圾"+i+"次");
            //System.gc();//Runtime
            //Runtime.getRuntime().gc();
        }
    }
}
