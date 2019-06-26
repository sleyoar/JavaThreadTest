package thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread3 implements Runnable{
    //private static List<String > list=new ArrayList<String>();
    private static CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
    static {
        list.add("AA");
        list.add("BB");
        list.add("CC");
    }

    @Override
    public void run() {
        Iterator<String> it=list.iterator();
        //每次读值同时写值
        while (it.hasNext()){
            System.out.println(it.next());
            list.add("AA");
        }
    }

    public static void main(String[] args) {
        MyThread3 mt=new MyThread3();
        for(int i=0;i<10;i++){
            new Thread(mt).start();
        }
        System.out.println(Thread.currentThread()+"执行完毕！");
    }
}
