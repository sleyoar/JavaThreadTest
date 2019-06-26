package ThreadWork20190626.work2;
import java.text.DecimalFormat;
public class Environment extends Thread {
    public synchronized void measure(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DecimalFormat df=new DecimalFormat("#.0");
        String temperature=df.format(Math.random()*100);
        String humidity=df.format(Math.random()*100);
        String speed=df.format(Math.random()*100);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("温度："+temperature+" 湿度："+humidity+" 风速："+speed);
    }
    @Override
    public void run() {
        this.measure();
    }
    public static void main(String[] args) {
        System.out.println("请稍等，传感器正在测量环境数据（5秒）");
        Environment en=new Environment();
        for(int i=0;i<100;i++){
            new Thread(en).start();
        }
    }
}
