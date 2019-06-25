package ThreadWork20190625.work3;
public class ThreadDemo extends Thread {
    private String name;
    private int time;
    public ThreadDemo(String name, int time) {
        this.name = name;
        this.time = time;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(time);
            System.out.println("Thread: "+name+" time: "+time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
