package lifecycle;

public class TestIsAlive extends  Thread {

    @Override
    public void run() {
        for(int i=0;i<=10;i++) {
            System.out.println("打印："+i);
        }
    }

    public static void main(String[] args) {
        TestIsAlive t=new TestIsAlive();
        System.out.println(t.isAlive()==true?"正在运行":"不在活动");
        t.start();
        System.out.println(t.isAlive()==true?"正在运行":"不再运行");
    }
}
