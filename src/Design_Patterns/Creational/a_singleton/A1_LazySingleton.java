package Design_Patterns.Creational.a_singleton;

/*
steps to remember if wanna make class singleTon :
1. private constructor
2. object creation with static method
3. create private field to store object so that we can't access
*/


class Samosa{
    private static Samosa setInstance;
    private String restaurant;

    public Samosa(String restaurant) {
        this.restaurant = restaurant;
    }

    public static Samosa getInstance(String restaurant){
        if(setInstance == null)
            setInstance = new Samosa(restaurant);

        return setInstance;
    }
}


class Singleton {
    private static Singleton obj;

    private Singleton() {}

    /* here created private constructor which is access by static method
     * as usual we know we directly call static methods
     * ex : Singleton.getSingleton();
     * */

    // this is lazy way to create single object
    public static Singleton getSingleton() {
        if (obj == null)
            obj = new Singleton();

        return obj;
    }
}

class A1_LazySingleton{
    public static void main(String[] args) {
       // this is how we call static methods with className
        Singleton s = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        System.out.println(s);
        System.out.println(s2);

    }
}