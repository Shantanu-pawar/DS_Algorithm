package Design_Patterns.Creational.a_singleton;

/*
* we can break singleton pattern with the help of reflection API
*
* if obj is already there -> throw exception
*
* */

import java.lang.reflect.Constructor;

class CrackSingleton{
    private static CrackSingleton1 instance;

    public CrackSingleton() {}

    public static CrackSingleton1 getInstance(){
        if(instance == null)
            instance = new CrackSingleton1();

        return instance;
    }
}

public class A4_Break_Singleton_Pattern {
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