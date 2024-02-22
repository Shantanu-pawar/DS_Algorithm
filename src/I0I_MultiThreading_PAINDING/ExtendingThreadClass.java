package I0I_MultiThreading_PAINDING;

// Extending Thread class : here we just extends thread class with obj

public class ExtendingThreadClass extends Thread{
    public void run() {
        System.out.println("MyThread is running");
    }

    public static void main(String[] args) {
        ExtendingThreadClass thread = new ExtendingThreadClass();
        thread.start();
    }
}

/*
commonly used methods in thread class

1. public void run(): is used to perform action for a thread.

2. public void start(): starts the execution of the thread.JVM calls the run() method on the thread.

3. public void sleep(long milliseconds):
Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

4. public void join(): waits for a thread to die.

*/
