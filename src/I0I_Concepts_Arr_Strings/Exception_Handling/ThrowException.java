package I0I_Concepts_Arr_Strings.Exception_Handling;

public class ThrowException {
    public static void main(String[] args) {

        //  custom Exception : throw block

        // here you used try catch block that basically handles another function's exception.

        try{
            function(5);
        }
        catch(Exception e) {
            System.out.println("you're under Age, tell you're papa to give complan to you! ");
        }


        System.out.println("thankYou for using our service.");
    }


    public static void function(int age) {

        if(age < 18) {
            throw new RuntimeException( " Sorry! yo're not allowed.");
        }
    }
}

