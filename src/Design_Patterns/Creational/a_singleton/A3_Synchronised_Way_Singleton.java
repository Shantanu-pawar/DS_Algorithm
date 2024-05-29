package Design_Patterns.Creational.a_singleton;


// this is synchronised way of creating singleton obj
class SingleTon{
    private static SingleTon obj;
    private SingleTon() {}

    // we're using synchronised block here to handle multiThreaded condition
    public static SingleTon getObj(){

        if(obj == null){
            synchronized (SingleTon.class){
                if(obj == null)
                    obj = new SingleTon();
            }
        }
        return obj;
    }
}


public class A3_Synchronised_Way_Singleton {
    public static void main(String[] args) {
        SingleTon s = SingleTon.getObj();
        System.out.println(s);
    }
}
