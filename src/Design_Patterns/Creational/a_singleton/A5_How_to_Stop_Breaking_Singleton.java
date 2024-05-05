package Design_Patterns.Creational.a_singleton;
import java.lang.reflect.Constructor;

public class A5_How_to_Stop_Breaking_Singleton {}

/*
 * we can break singleton pattern with the help of reflection API
 *
 * if obj is already there -> throw exception
 *
 * */

class CrackSingleton1 {
    private static CrackSingleton1 instance;

    public CrackSingleton1() {

        // how to avoid break of singleton pattern
        // so if anyone trying to access constructor then we'll throw exception
        if (instance != null)
            throw new RuntimeException("Don't try to break my pattern");
    }

    public static CrackSingleton1 getInstance(){
        if(instance == null)
            instance = new CrackSingleton1();

        return instance;
    }
}

class Main {
    public static void main(String[] args) throws Exception{
        CrackSingleton1 s = CrackSingleton1.getInstance();
        System.out.println(s.hashCode());

        // Breaking of singleton obj via constructor
        Constructor<CrackSingleton1> constructor =
                CrackSingleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        CrackSingleton1 s2 = constructor.newInstance();
        System.out.println(s2.hashCode());

    }
}