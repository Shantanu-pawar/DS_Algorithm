package I0I_Concepts_Arr_Strings.Exception_Handling;

public class Custum_Exceptions {

// this handle's custom Exception here.
// Custom Exceptions building.

    public static void main(String[] args) {

        try {
            function(2);
        }

        catch(UnderAgeException s) {
            System.out.println(s.getMessage());
        }
    }

    public static void function(int age) throws UnderAgeException{

        if(age < 18){
            throw new UnderAgeException("bada hoja pehle");
        }
    }

    // we've to create our custom exceptions like this.
    public static class UnderAgeException extends Exception {
        public UnderAgeException(String msg) {
            super(msg);
        }
    }
}

