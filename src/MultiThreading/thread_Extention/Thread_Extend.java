package MultiThreading.thread_Extention;

public class Thread_Extend extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("this is child thread");
        }
    }
}
