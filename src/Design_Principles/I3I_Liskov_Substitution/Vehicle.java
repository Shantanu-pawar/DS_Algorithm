package Design_Principles.I3I_Liskov_Substitution;

class VehicleType {
    void move() {
        System.out.println("Default vehicle is moving🚸");
    }
}

class Car extends VehicleType {
    @Override
    void move() {
        System.out.println("Car is moving on it's TOP speed 🔝");
    }
}

class Aeroplane extends VehicleType {
    @Override
    void move() {
        System.out.println("Aeroplane is flying ✈🛫");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        VehicleType aeroplane = new Aeroplane();
        aeroplane.move();

        VehicleType car = new Car();
        car.move();

        VehicleType vehicle = new VehicleType();
        vehicle.move();
    }
}
