package CoreJava_java8.I7I_Optional;

import java.util.Optional;

public class OptionalCls {
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
