package MultiThreading;

// Implementing the Runnable interface in Java
public class ImplRunnableInterface  implements Runnable {
    public void run() {
        System.out.println("This is a thread running using the Runnable interface.");
    }

    public static void main(String[] args) {
        ImplRunnableInterface myRunnable = new ImplRunnableInterface();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
