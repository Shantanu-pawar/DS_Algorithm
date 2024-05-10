package Questions_nd_CONCEPTS.A_Painding_Questions;

/*
stingBuffers and stringBuilders are used for -
        string concatenation operations.

stringBuilder is faster than stringBuffers in single threaded scenarios.
_________________________________________________________
Choosing Between String Buffer and String Builder:
_________________________________________________________
1. Use String Buffer when you need thread safety, such as in multi Threaded environments.
    Use String Builder when you are working in a single-threaded environment or when you are
2. certain about handling synchronization manually, as it offers better performance.

 */

public class impl_Documentation {
    public static void main(String[] args) {

        Impl();
    }
    static void Impl(){

//        StringBuffer s = new StringBuffer();

//        this same functions will happens in stringBuilders also
        StringBuilder s = new StringBuilder();

        s.append("shantanu ");
        System.out.println(s);

        // inserted at 5th char pos
        s.insert(5, "beautiful");
        System.out.println(s);

        // deleted from 0 to 5th char
        s.delete(0, 5);
        System.out.println(s);

        // written new string in the new form
        String result = s.toString(); // Converts the buffer to a string
        System.out.println(result);
    }
}
