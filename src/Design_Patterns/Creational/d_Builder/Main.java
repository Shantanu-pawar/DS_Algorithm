package OOPs_Concepts.Design_Patterns.Creational.d_Builder;

import java.util.ArrayList;
import java.util.List;

// Pizza class representing the complex object to be built
class Pizza {
    private String size;
    private String crustType;
    private List <String> toppings;
    private List<String> extraAdditions;

    public Pizza(String size, String crustType, List<String> toppings, List<String> extraAdditions) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
        this.extraAdditions = extraAdditions;
    }

    // Getters for Pizza attributes...
}

// PizzaBuilder class to construct Pizza objects
class PizzaBuilder {
    private String size;
    private String crustType;
    private List<String> toppings = new ArrayList<>();
    private List<String> extraAdditions = new ArrayList<>();

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setCrustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public PizzaBuilder addExtraAddition(String extraAddition) {
        this.extraAdditions.add(extraAddition);
        return this;
    }

    public Pizza build() {
        return new Pizza(size, crustType, toppings, extraAdditions);
    }
}

// Client code to use the PizzaBuilder
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setSize("Large")
                .setCrustType("Thin Crust")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addExtraAddition("Extra Cheese")
                .build();
        // Now, pizza is a fully constructed Pizza object with specified attributes
    }
}
