package _Output_Based_PsuedoCodes;

public class Inheritance1 {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        System.out.println(a.i);
    }
}
/*NOTE : at the time of method creation, when we wanted to access the child class
* method then the method must be define in parent class also otherwise
* we can not able to access it!
* */

class A {
    int i = 10;

    void show() {
        System.out.println("A");
    }
}

class B extends A {
    int i = 20;

    void show() {
        System.out.println("B");
    }

    void show1() {
        System.out.println("A is showing in new class");
    }
}
