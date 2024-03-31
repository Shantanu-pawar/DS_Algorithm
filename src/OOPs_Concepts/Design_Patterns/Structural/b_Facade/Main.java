package OOPs_Concepts.Design_Patterns.Structural.b_Facade;

// Step 1: Define a Facade interface
interface HomeTheaterFacade {
    void turnOn();
    void turnOff();
}

// Step 2: Implement the Facade interface
class HomeTheater implements HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Speakers speakers;

    public HomeTheater() {
        // Initialize all components
        tv = new TV();
        dvdPlayer = new DVDPlayer();
        amplifier = new Amplifier();
        speakers = new Speakers();
    }

    @Override
    public void turnOn() {
        // Turn on all components
        tv.turnOn();
        dvdPlayer.turnOn();
        amplifier.turnOn();
        speakers.turnOn();
    }

    @Override
    public void turnOff() {
        // Turn off all components
        tv.turnOff();
        dvdPlayer.turnOff();
        amplifier.turnOff();
        speakers.turnOff();
    }
}

// Step 3: Define and implement the subsystem components
class TV {
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    public void turnOff() {
        System.out.println("TV is turned off");
    }
}

class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD Player is turned on");
    }

    public void turnOff() {
        System.out.println("DVD Player is turned off");
    }
}

class Amplifier {
    public void turnOn() {
        System.out.println("Amplifier is turned on");
    }

    public void turnOff() {
        System.out.println("Amplifier is turned off");
    }
}

class Speakers {
    public void turnOn() {
        System.out.println("Speakers are turned on");
    }

    public void turnOff() {
        System.out.println("Speakers are turned off");
    }
}

// Step 4: Client code that uses the facade
public class Main {
    public static void main(String[] args) {
        // Create a HomeTheater facade
        HomeTheaterFacade homeTheater = new HomeTheater();

        // Turn on the home theater system
        homeTheater.turnOn();

        // Turn off the home theater system
        homeTheater.turnOff();
    }
}
