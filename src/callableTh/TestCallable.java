package callableTh;

import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) {
        MyCallable mc=new MyCallable();
        FutureTask<Integer> ft=new FutureTask<Integer>(mc);
        new Thread(ft).start();
        try {
            int result=ft.get();
            System.out.println("Result="+result);//sum
            //FutureTask 实现了闭锁？？
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
