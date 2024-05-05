package Design_Patterns.Creational.a_singleton;

class Coffee{

    // this is how we create eagar way obj creation.
    // eager obj creation matlab - ham yahipe obj create karenge ek baar me
    private static Coffee coffee = new Coffee();

    public static Coffee getCoffee(){
        return coffee;
    }

}

public class A2_EagerSingleton_Obj {
    public static void main(String[] args) {

        Coffee c = Coffee.getCoffee();
        System.out.println(c.hashCode());
    }
}