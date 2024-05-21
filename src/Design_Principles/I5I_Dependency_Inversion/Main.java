package Design_Principles.I5I_Dependency_Inversion;

interface Vehicle {
    void run();
}

class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Car moving...");
    }
}

class Bus implements Vehicle {
    @Override
    public void run(){
        System.out.println("cityBus is moving...");
    }
}

class Driver {
    //constructor Injection
    private Vehicle move;

    public Driver(Vehicle move) {
        this.move = move;
    }

    public void drive() {
        move.run();
    }
}


public class Main {
    public static void main(String[] args) {

    // Create a Driver instance and inject the Car dependency
        Driver driver = new Driver(new Car());
        driver.drive();

        Driver driver1 = new Driver(new Bus());
        driver1.drive();
    }
}
