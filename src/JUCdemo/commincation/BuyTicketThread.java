package JUCdemo.commincation;

public class BuyTicketThread {
    public static void main(String[] args) {
        TicketsHouse officer=new TicketsHouse();
        //创建线程对象
        Thread zhangfei=new Thread(officer,"张飞");
        Thread liubei=new Thread(officer,"刘备");
        Thread guanyu=new Thread(officer,"关羽");
        zhangfei.start();
        liubei.start();
        guanyu.start();
    }

}
