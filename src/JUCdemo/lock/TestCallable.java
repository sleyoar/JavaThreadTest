package JUCdemo.lock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {

    public static void main(String[] args) {
         // 1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果
        CallableDemo cd=new CallableDemo();
        FutureTask<Integer>result=new FutureTask<>(cd);
        new Thread(result).start();
        // 2.接收线程运算后的结果
        try {
            int sum= result.get();
            System.out.println(sum);
            // FutureTask 可用于 闭锁
            System.out.println("------------------------------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

