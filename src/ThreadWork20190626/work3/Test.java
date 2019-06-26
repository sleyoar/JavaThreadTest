package ThreadWork20190626.work3;

public class Test {
    public static void main(String[] args) {
        Customer c1=new Customer();
        Customer c2=new Customer();
        c1.start();c2.start();
    }
}
