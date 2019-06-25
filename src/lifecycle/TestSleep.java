package lifecycle;

public class TestSleep {
    public static void main(String[] args) {
        SleepThread st=new SleepThread();
        st.start();
    }
}
