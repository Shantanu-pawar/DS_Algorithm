package CoreJava_java8.All_Lambda_Expression.AllAboutLambda._3_ThreadsCreation;

public class ThreadDemo {
    public static void main(String[] args) {

        Runnable thread1 = () -> {
          // now thread is created you've to write the task here

            for(int i=0; i<15; i++) {

                System.out.println(i + " is the series");


                try {
                    Thread.sleep(3000); // each statement print after 3 sec
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

//        now here we're defining the thread
        Thread t = new Thread(thread1);
        t.start();
    }
}
