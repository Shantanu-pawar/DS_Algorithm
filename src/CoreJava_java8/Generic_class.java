package CoreJava_java8;

public class Generic_class {
    public static void main(String[] args) {
        Generics<Double> c = new Generics<>(231.323);
        c.printStuff();
    }
}

// generic class is just a way to handle the all the datatype with the same blueprint
// by using T, we just have to define <> this thing in obj creation of the class.
// NOTE : we can also define the two variables in this ex : class Generics <T, V, A> like this.
class Generics<T> {
    T val;
    Generics(T val) {
        // reference
        this.val = val;
    }

    void printStuff() {
        System.out.println(val + " : & the datatype of this value is:: "
                + val.getClass().getName());
    }
}
