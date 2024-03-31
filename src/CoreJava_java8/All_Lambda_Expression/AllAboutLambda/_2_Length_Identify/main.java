package CoreJava_java8.All_Lambda_Expression.AllAboutLambda._2_Length_Identify;

public class main {
    public static void main(String[] args) {

        LengthInterface a = (str -> str.length());

        System.out.println(a.getLength("bhuesh is the str"));

    }
}
