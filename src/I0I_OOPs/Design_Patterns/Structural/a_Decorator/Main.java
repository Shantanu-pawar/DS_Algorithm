package I0I_OOPs.Design_Patterns.Structural.a_Decorator;
// Step 1: Define the base component interface
interface Pizza {
    String getDescription();
    double getCost();
}

// Step 2: Implement concrete components
class MargheritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 6.99;
    }
}

// Step 3: Define the decorator interface
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}

// Step 4: Implement concrete decorators
class ExtraCheeseDecorator extends PizzaDecorator {
    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}

class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}

// Step 5: Client code that uses the decorators to modify pizza objects
public class Main {
    public static void main(String[] args) {
        // Create a base pizza
        Pizza pizza = new MargheritaPizza();

        // Add extra cheese
        pizza = new ExtraCheeseDecorator(pizza);

        // Add mushrooms
        pizza = new MushroomDecorator(pizza);

        // Display description and cost
        System.out.println("Pizza Description: " + pizza.getDescription());
        System.out.println("Total Cost: $" + pizza.getCost());
    }
}
