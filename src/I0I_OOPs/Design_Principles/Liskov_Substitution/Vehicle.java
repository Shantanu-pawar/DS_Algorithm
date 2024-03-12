package I0I_OOPs.Design_Principles.Liskov_Substitution;

public class Vehicle {
    public static void main(String[] args) {
        VehicleType type = new Ninja();
        type.run();

        VehicleType type1 = new VehicleType();
        type1.run();
    }
}

class VehicleType{
    public void run() {
        System.out.println("Default unIdentified vehicle 🚸❌💸");
    }
}

class Mustang extends VehicleType{
    public void run(){
        System.out.println("This mustang is 4 wheel type and runs very fast 🏎⬆");
    }
}

class Ninja extends VehicleType{
    public void run(){
        System.out.println("this bike is pickup 0-100 in 5 seconds 🔥🔥");
    }
}