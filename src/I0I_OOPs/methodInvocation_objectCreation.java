package I0I_OOPs;

public class methodInvocation_objectCreation {
    public static void main(String[] args) {

        calculator     cal =    new calculator();
//        class    refferance  [this is object creation]

        cal.sum(4, 2);
    }
}

class calculator{
    int a;
    int b;

    int result;
    public void sum(int a, int b){
        result = a+b;
        System.out.println(result);
    }
}