package OOPs_Concepts.Design_Principles.Open_Closed;

public class Subtract implements Operations{

    @Override
    public int perform(int a, int b) {
        return a-b;
    }
}
