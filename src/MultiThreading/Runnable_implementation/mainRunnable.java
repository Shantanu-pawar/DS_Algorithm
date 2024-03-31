package MultiThreading.Runnable_implementation;

public class mainRunnable {
    public static void main(String[] args) {

        // we've to make an instance of this runnable class
        runnable_Class runnableClass = new runnable_Class();

        // here we created new thread and give it a runnable instance so that this thread is runnable thread.
        Thread thread = new Thread(runnableClass);
        thread.start();

        for (int i = 0; i < 34; i++) {
            System.out.println("This is main runnable.");
        }
    }
}
