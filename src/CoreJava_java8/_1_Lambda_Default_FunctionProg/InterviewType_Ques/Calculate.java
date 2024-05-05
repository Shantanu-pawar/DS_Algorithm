package CoreJava_java8._1_Lambda_Default_FunctionProg.InterviewType_Ques;

// how do we use this in terms of abstract methods |
// and instead of impl in main class create separate class then invoke this methods

public class Calculate implements SumInterface, SubtractInterface {
    public static void main(String[] args) {

        Calculate p = new Calculate();
        System.out.println(p.check(1, 3));
    }

    @Override
    public int check(int a, int b) {
        return SumInterface.super.check(a, b);
    }
}

interface SumInterface {
    default int check(int a, int b) {
        return a + b;
    }
}

interface SubtractInterface {
    default int check(int a, int b) {
        return a - b;
    }
}