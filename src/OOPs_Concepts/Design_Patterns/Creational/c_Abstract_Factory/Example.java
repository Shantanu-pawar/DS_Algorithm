package OOPs_Concepts.Design_Patterns.Creational.c_Abstract_Factory;

// Step 1: Define an abstract factory interface for creating families of related objects
interface AnimalFactory {
    Animal createDog();
    Animal createCat();
}

// Step 2: Implement concrete factories for creating families of related objects
class DomesticAnimalFactory implements AnimalFactory {
    @Override
    public Animal createDog() {
        return new DomesticDog();
    }

    @Override
    public Animal createCat() {
        return new DomesticCat();
    }
}

class WildAnimalFactory implements AnimalFactory {
    @Override
    public Animal createDog() {
        return new WildDog();
    }

    @Override
    public Animal createCat() {
        return new WildCat();
    }
}

// Step 3: Define the product interface or abstract class
interface Animal {
    void sound();
}

// Step 4: Implement concrete products
class DomesticDog implements Animal {
    @Override
    public void sound() {
        System.out.println("Domestic Dog says: Woof!");
    }
}

class DomesticCat implements Animal {
    @Override
    public void sound() {
        System.out.println("Domestic Cat says: Meow!");
    }
}

class WildDog implements Animal {
    @Override
    public void sound() {
        System.out.println("Wild Dog says: Bark!");
    }
}

class WildCat implements Animal {
    @Override
    public void sound() {
        System.out.println("Wild Cat says: Roar!");
    }
}

public class Example {
    // Step 5: Client code that uses the abstract factory to create families of related objects
    public static void main(String[] args) {
        // Create a DomesticAnimalFactory
        AnimalFactory domesticFactory = new DomesticAnimalFactory();
        Animal domesticDog = domesticFactory.createDog();
        Animal domesticCat = domesticFactory.createCat();

        domesticDog.sound(); // Output: Domestic Dog says: Woof!
        domesticCat.sound(); // Output: Domestic Cat says: Meow!

        // Create a WildAnimalFactory
        AnimalFactory wildFactory = new WildAnimalFactory();
        Animal wildDog = wildFactory.createDog();
        Animal wildCat = wildFactory.createCat();

        wildDog.sound(); // Output: Wild Dog says: Bark!
        wildCat.sound(); // Output: Wild Cat says: Roar!
    }
}
