package lifecycle;

public class TestYield {
    public static void main(String[] args) {
        YieldThread yt=new YieldThread();
        YieldThread yt1=new YieldThread();
        yt.start();
        yt1.start();

    }
}
