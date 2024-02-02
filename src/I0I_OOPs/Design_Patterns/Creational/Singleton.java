package I0I_OOPs.Design_Patterns.Creational;

public class Singleton {
    public static void main(String[] args) {

        SingletonClass s = new SingletonClass();
        s.setInformation("this is SingleTon instance.");
        System.out.println(s.getInformation());

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