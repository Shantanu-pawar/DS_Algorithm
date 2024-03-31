package OOPs_Concepts;

public class Multiple_Inheritance {
    public static void main(String[] args) {
        // Create an instance of class Car
        Car myCar = new Car();
        myCar.start();
        myCar.turnLeft();
        myCar.drive();
    }
}


// Define interface for the Engine
interface Engine {
    void start();
}

// Define interface for the Steering
interface Steering {
    void turnLeft();
}

// Class Car implements both Engine and Steering interfaces
class Car implements Engine, Steering {
    @Override
    public void start() {

        System.out.println("Car starting...");
    }
    @Override
    public void turnLeft() {

        System.out.println("Car turning right...");
    }

    public void drive() {
        // Additional methods specific to class Car, if any
        System.out.println("Car is on the move!");
    }
}

