package ThreadWork20190625.work9;

public class Test {
    public static void main(String[] args) {
        BookingClerk bt=new BookingClerk();
        new BookingTest(bt,7);
        new BookingTest(bt,5);
    }
}
