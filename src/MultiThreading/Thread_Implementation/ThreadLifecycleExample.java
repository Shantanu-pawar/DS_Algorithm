package MultiThreading.Thread_Implementation;

public class ThreadLifecycleExample {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        System.out.println("Thread state after creation: " + myThread.getState());

        myThread.start();
        System.out.println("Thread state after starting: " + myThread.getState());

        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state after completion: " + myThread.getState());
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has finished.");
    }
}
