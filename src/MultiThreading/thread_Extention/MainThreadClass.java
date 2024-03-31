package MultiThreading.thread_Extention;

public class MainThreadClass {
    public static void main(String[] args) {

        Thread_Extend threadExtend = new Thread_Extend();
        threadExtend.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("this is Parent thread");
        }
    }
}