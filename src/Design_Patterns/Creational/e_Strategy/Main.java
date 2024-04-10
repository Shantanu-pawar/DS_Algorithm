package OOPs_Concepts.Design_Patterns.Creational.e_Strategy;

// Step 1: Define the Strategy interface
interface SoundStrategy {
    void makeSound();
}

// Step 2: Implement concrete strategies for different sounds
class WoofSoundStrategy implements SoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class MeowSoundStrategy implements SoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Step 3: Context class that uses the strategy
class AnimalContext {
    private SoundStrategy soundStrategy;

    // Set the strategy dynamically at runtime
    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }

    // Method that uses the strategy
    public void makeSound() {
        if (soundStrategy != null) {
            soundStrategy.makeSound();
        } else {
            System.out.println("No sound strategy set.");
        }
    }
}

// Step 4: Client code that uses the strategy
public class Main {
    public static void main(String[] args) {
        // Create an AnimalContext for Dog with Woof sound strategy
        AnimalContext dogContext = new AnimalContext();
        dogContext.setSoundStrategy(new WoofSoundStrategy());
        dogContext.makeSound(); // Output: Woof!

        // Create an AnimalContext for Cat with Meow sound strategy
        AnimalContext catContext = new AnimalContext();
        catContext.setSoundStrategy(new MeowSoundStrategy());
        catContext.makeSound(); // Output: Meow!
    }
}
