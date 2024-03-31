package OOPs_Concepts.Design_Principles.Interface_Seggregation;


interface WorkTime {
    void work();
}

interface LunchTime {
    void eat();
}

// Define worker classes implementing interfaces
class Worker implements WorkTime, LunchTime {
    @Override
    public void work() {
        System.out.println("Worker working...");
    }

    @Override
    public void eat() {
        System.out.println("Worker eating...");
    }
}

class Robot implements WorkTime {
    @Override
    public void work() {
        System.out.println("Robot working...");
    }
}

public class Main {
    public static void main(String[] args) {
        WorkTime worker = new Worker();
        WorkTime robot = new Robot();

        worker.work(); // Output: Worker working...
        LunchTime workerLunch = new Worker();
        workerLunch.eat();

        robot.work(); // Output: Robot working...
    }
}
