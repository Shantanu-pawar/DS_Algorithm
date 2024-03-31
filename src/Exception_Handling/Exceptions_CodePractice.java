package Exception_Handling;

public class Exceptions_CodePractice {
    public static void main(String[] args) {
        int i = 2;
        int b = 2;

        try {
            int k = i/b;

// 		note : it will find out if there is out of bound exception
//      if that not found then it'll throw an error and break the program flow
            int []arr = {1 , 23, 4, 5};
            System.out.println(arr[8]);
        }

        catch(ArithmeticException e) {
            System.out.println("this is arithmatic exception");
        }

        catch(IndexOutOfBoundsException e) {
            System.out.println(e + "this is index out of bound exception");
        }

        // if you don't have any idea what type of exception is this then you can always write this at teh End
        catch(Exception e) {
            System.out.println("default Exception");
        }


        System.out.println(" End ");
    }
}
