package callableTh;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private Integer sum=0;
    /**
     * 类似run方法不过带返回值，返回值类型就是泛型的类型
     */
    @Override
    public Object call() throws Exception {
        for(int i=0;i<100;i++){
            sum+=i;
        }
        return sum;
    }
}
