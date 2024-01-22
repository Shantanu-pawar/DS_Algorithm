package I0I_OOPs;

// Engine interface
interface Engine {
    void start();
}

// GasEngine implementation
class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Gas Engine");
        // Gas engine specific implementation
    }
}

// ElectricEngine implementation
class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
        // Electric engine specific implementation
    }
}

// Car class with Dependency Injection
class Car {
    private Engine engine;

    // Constructor with Engine parameter for Dependency Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Method that uses the injected engine
    public void startCar() {
        System.out.println("Starting the car...");
        engine.start(); // Using the injected engine
    }
}

// Main class to demonstrate the usage
public class Dependency_injection_impl {

    public static void main(String[] args) {
        // Creating instances of different engines
        Engine gasEngine = new GasEngine();
        Engine electricEngine = new ElectricEngine();

        // Creating cars with different engines using Dependency Injection
        Car carWithGasEngine = new Car(gasEngine);
        Car carWithElectricEngine = new Car(electricEngine);

        // Starting the cars
        carWithGasEngine.startCar();
        carWithElectricEngine.startCar();
    }
}
