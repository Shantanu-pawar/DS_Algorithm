package Design_Principles.I2I_Open_Closed_principle;

interface Operations {
    double operation(double a, double b);
}

class Subtract implements Operations{
    @Override
    public double operation(double a, double b) {
        return a-b;
    }
}

class Add implements Operations{
    @Override
    public double operation(double a, double b) {
        return a+b;
    }
}

class Calculator{
    public double calculate(double a, double b, Operations op){
        return op.operation(a, b);
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        double store = c.calculate(31, 1, new Add());
        System.out.println(store);

    }
}