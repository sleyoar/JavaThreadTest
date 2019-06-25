package ThreadWork20190625.work7;
class subTread extends Thread{
    public subTread(String s){
        super(s);
    }
    @Override
    public void run() {
        System.out.println(" "+getName());
        try{
            sleep((int)(Math.random()*1000));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("结束！"+getName());
    }
}
public class Test {
    public static void main(String[] args) {
        Thread t1=new subTread("First");
        Thread t2=new subTread("Second");
        t1.start();t2.start();
    }
}
