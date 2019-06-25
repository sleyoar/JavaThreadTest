package lifecycle;

public class ScheduleThread extends  Thread {
    private String name;// 线程名

    public ScheduleThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("线程" + name + "打印" + i);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        // 输出主线程的优先级
        System.out.println("主线程的优先级" + Thread.currentThread().getPriority());
        // 创建两个线程对象
        ScheduleThread t1 = new ScheduleThread("1");
        ScheduleThread t2 = new ScheduleThread("2");
        // 输出两个线程对象的优先级
        System.out.println("线程" + t1 + "的优先级" + t1.getPriority());
        System.out.println("线程" + t2 + "的优先级" + t2.getPriority());
        // 设置第一个线程优先级最高
        t1.setPriority(Thread.MAX_PRIORITY);
        // 设置第二个线程优先级最低
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("线程" + t1 + "的优先级" + t1.getPriority());
        System.out.println("线程" + t2 + "的优先级" + t2.getPriority());
        t1.start();
        t2.start();
    }
}
