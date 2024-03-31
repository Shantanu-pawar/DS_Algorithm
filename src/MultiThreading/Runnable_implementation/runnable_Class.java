package MultiThreading.Runnable_implementation;

public class runnable_Class implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 56 ; i++) {
            System.out.println("this is runnable classes impl");
        }    
    }
}
