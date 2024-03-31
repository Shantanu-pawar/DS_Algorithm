package OOPs_Concepts.Design_Principles.Open_Closed;

public class Calculator {

    // here we don't modify the core code, instead we can keep adding new functionalities
    public int CalculateNumbers(int a, int b, Operations op){
        return op.perform(a, b);
    }
}
