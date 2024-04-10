package OOPs_Concepts.Design_Principles.Dependency_Inversion;

interface Run {
    void run();
}

// Vehicle class implementing the Movable interface
class Car implements Run {
    @Override
    public void run() {
        System.out.println("Car moving...");
    }
}

class Bus implements Run {
    @Override
    public void run(){
        System.out.println("cityBus is moving...");
    }
}

class Driver {
    //constructor Injection
    private Run vehicle;
    public Driver(Run vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.run();
    }
}

// Client class utilizing the Car and Driver classes
public class Main {
    public static void main(String[] args) {
        // Create a Car instance
        Car car = new Car();

        // Create a Driver instance and inject the Car dependency
        Driver driver = new Driver(car);
        driver.drive();

        Driver driver1 = new Driver(new Bus());
        driver1.drive();
    }
}
