package CoreJava_java8._5_Constructors_Method_Refereces;




// we are referring non-static methods. You can refer methods by class object and anonymous object.

public class I2I_Reference_To_InstanceOfMethod {
    public static void main(String[] args) {

        Operate op = new Operate(); // create new object of that class

        // now referring method with the help of this object
        Calculator calculation = op::sum;
        calculation.sum(123,2);
    }
}

interface Calculator{
    void sum(int a, int b);
}


class Operate{
    public void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
}