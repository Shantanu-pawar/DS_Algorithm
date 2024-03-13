package I0I_OOPs.Design_Patterns.Creational.a_singleton;

public class Singleton_StandardEx {
    public static void main(String[] args) {
        // Get the singleton instance and check whether it's same or not
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        System.out.println(singleton1 == singleton2); // Output: true
    }
}

    class Singleton {
        // Static field to hold the single instance of the class
        private static Singleton instance;

        // Private constructor to prevent instantiation from outside
        private Singleton() {}

        // Static method to provide access to the singleton instance
        public static Singleton getInstance() {
            // Lazy initialization: create instance if it doesn't exist
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
