package thread;

public class TestTickets {

    public static void main(String[] args) {
        //使用runnable方式
       /* TicketsRunable tr=new TicketsRunable();
        Thread t1=new Thread(tr,"窗口一");
        Thread t2=new Thread(tr,"窗口一");
        Thread t3=new Thread(tr,"窗口一");
        t1.start();
        t2.start();
        t3.start();*/

        //方式二
        TicketesThread t1=new TicketesThread("窗口一");
        TicketesThread t2=new TicketesThread("窗口二");
        TicketesThread t3=new TicketesThread("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
