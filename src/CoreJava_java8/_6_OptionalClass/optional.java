package CoreJava_java8._6_OptionalClass;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {

    // here despite our string is null but without any exceptions it handled the null pointer.!
        Optional<String> nameCheck = getName();
        System.out.println(nameCheck);
    }

    public static Optional<String> getName() {
        String name = null;
        return Optional.ofNullable(name);
    }
}
