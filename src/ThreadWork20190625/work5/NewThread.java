package ThreadWork20190625.work5;
public class NewThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("New is running "+i);
        }
    }
}
