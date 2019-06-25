package lifecycle;
/**
 * yield():让出cpu,使相同优先级的线程去抢占cpu,
 * 该方法不能保证会让出CPU，
 * 本线程让出cpu,又被线程调度程序调度
 */
public class YieldThread extends  Thread {

    @Override
    public void run() {
        for(int i=1;i<=15;i++) {
            System.out.println(Thread.currentThread().getName()+"打印："+i);
            if(i%10==0) {
                yield();//让出cpu,
            }
        }
    }
}
