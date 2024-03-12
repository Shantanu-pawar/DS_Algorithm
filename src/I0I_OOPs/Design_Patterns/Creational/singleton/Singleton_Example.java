package I0I_OOPs.Design_Patterns.Creational.singleton;

public class Singleton_Example {
    public static void main(String[] args) {
// we've to make sure that our class should be create only once
        SingletonClass s = new SingletonClass();
        s.setInformation("this is SingleTon instance.");
        System.out.println(s.getInformation());
        System.out.println(s.hashCode());

    }
}

class SingletonClass{
    private static SingletonClass instance;
    private String information;

    public SingletonClass(){}

    public static SingletonClass getInstance(){
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    // just set getter and setters for string :?

    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }
}