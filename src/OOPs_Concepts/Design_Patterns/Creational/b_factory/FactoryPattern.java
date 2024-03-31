package OOPs_Concepts.Design_Patterns.Creational.b_factory;

// Step 1: Define an interface or abstract class for the factory
interface AnimalFactory {
    Animal createAnimal();
}

// Step 2: Implement concrete factories for different types of animals
class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

// Step 3: Define the product interface or abstract class
interface Animal {
    void sound();
}

// Step 4: Implement concrete products
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

// Step 5: Client code that uses the factory to create objects
public class FactoryPattern {
    public static void main(String[] args) {
        // Create a Dog using DogFactory
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.sound(); // Output: Woof!

        // Create a Cat using CatFactory
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.sound(); // Output: Meow!
    }
}

/* Explanation | In this example:

We define the AnimalFactory interface with a createAnimal() method.

We implement concrete factories (DogFactory and CatFactory) that implement the AnimalFactory
interface and provide specific implementations of createAnimal()
to create instances of Dog and Cat respectively.

We define the Animal interface with a sound() method and implement concrete products
 (Dog and Cat) that implement the Animal interface.

Finally, in the client code, we use the factory to create instances of Dog and Cat without
directly instantiating them, promoting loose coupling between the client code and the concrete classes.


*/