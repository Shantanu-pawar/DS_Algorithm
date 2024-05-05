package CoreJava_java8._2_StaticMethod;

public class Interview_question {}



// Question: can we define interface instead of main class?
interface Main{
    public static void main(String[] args) {
        // cause the reason is we can define static methods inside the interface.
        System.out.println("we actually can use this class as interface");
    }
}

