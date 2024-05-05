package CoreJava_java8._5_Constructors_Method_Refereces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example_1 {}

class Test1 {
    public void check(String str) {
        // here we're checking if str contains "palesha" or not
        Predicate<String> s = x -> x.contains("pal");

        // if the substring contains in our main String then we can print otherwise not
        if(s.test(str))
            System.out.println(str);
    }


    public static void main(String[] args) {
        List<String> student = Arrays.asList("ravi-palesha", "sham-ssvps", "rakesh-palesha");

        // here let's see to access without static methods
        Test1 test = new Test1();
        student.forEach(test::check);
    }
}
