import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication

public class MySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}

@Component
class Dependency {
    public void doSomething() {
        System.out.println("Dependency is doing something...");
    }
}

@Component
class MyComponent {

    private final Dependency dependency;

    @Autowired
    public MyComponent(Dependency dependency) {
        this.dependency = dependency;
    }

    public void performAction() {
        dependency.doSomething();
    }
}
