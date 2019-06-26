package JUCdemo.lock;

import java.util.concurrent.Callable;
/*
 * 一、创建执行线程的方式三：实现 Callable 接口。
 * 相较于实现 Runnable 接口的方式，方法可以有返回值，并且可以抛出异常。
 *
 * 二、执行 Callable 方式，需要 FutureTask 实现类的支持，
 * 用于接收运算结果。  FutureTask 是  Future 接口的实现类
 */
public class CallableDemo  implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=1;i<=10000;i++){
            sum+=i;
        }
        return sum;
    }
}
