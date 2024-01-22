package I0I_Exception_Handling;

public class CustomThrow_Exceptions {

// this handle's custom Exception here and Custom Exceptions building.
    public static void main(String[] args) {
        try {
            function(19);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void function(int age) throws UnderAgeException, OverAgeException{
        if(age <= 18){
            throw new UnderAgeException("bada hoja pehle");
        }
        else if(age > 18){
            throw new OverAgeException("Bencho kafi bada ho gya re tu!");
        }
    }

    // we've to create our custom exceptions like this.
    static class UnderAgeException extends Exception {
        public UnderAgeException(String msg) {
            super(msg);
        }
    }

    static class OverAgeException extends Exception {
        public OverAgeException(String msg){
            super(msg);
        }
    }
}

