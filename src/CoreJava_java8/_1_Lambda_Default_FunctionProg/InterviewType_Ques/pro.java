package CoreJava_java8._1_Lambda_Default_FunctionProg.InterviewType_Ques;

// how do we used this in terms of abstract methods |
// and instead of impl in main class create separate class then invoke this methods

public class pro implements sum, sub {
    public static void main(String[] args) {
        pro p = new pro();
        System.out.println(p.add(1, 3));
    }

    @Override
    public int add(int a, int b) {
        return sum.super.add(a, b);
    }
}

interface sum {
    default int add(int a, int b) {
        return a + b;
    }
}

interface sub {
    default int addi(int a, int b) {
        return a - b;
    }
}