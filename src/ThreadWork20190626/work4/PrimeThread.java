package ThreadWork20190626.work4;

public class PrimeThread extends Thread {
    private Thread beforeThread;
    private int start;
    private int end;

    public PrimeThread(int start, int end,Thread beforeThread) {
        this.start = start;
        this.end = end;
        this.beforeThread=beforeThread;
    }
    public void prime(){
        int num=0;
        for(int i=start+1;i<end;i++){
            synchronized (this){
                int flag=1;
                for(int j=2;j<Math.ceil(Math.sqrt(i));j++){
                    if(i%j==0){
                        flag=0;
                    }
                }if(flag==1){
                    num++;
                    System.out.print(i+" ");
                    if(num%8==0){
                        System.out.println();
                    }
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"素数个数："+num);
    }
    @Override
    public void run() {
        if(beforeThread!=null){
            try {
                beforeThread.join();
                this.prime();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            this.prime();
        }

    }
}
