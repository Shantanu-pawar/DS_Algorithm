package I0I_MultiThreading_PAINDING;

public class ExtendingThreadClass extends Thread{
    // Extending Thread class example
    public void run() {
        System.out.println("MyThread is running");
    }

    public static void main(String[] args) {
        ExtendingThreadClass thread = new ExtendingThreadClass();
        thread.start();
    }
}
