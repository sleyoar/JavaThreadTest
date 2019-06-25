package ThreadWork20190625.work6;

public class Test implements Runnable {
    @Override
    public void run() {
        System.out.println("running");
    }
    void go(){
        start(1);
    }
    void start(int i){

    }
    public static void main(String[] args) {
        Test test=new Test();
        Thread t=new Thread(test);
        t.start();
    }
}
