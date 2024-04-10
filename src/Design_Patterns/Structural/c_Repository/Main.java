package OOPs_Concepts.Design_Patterns.Structural.c_Repository;

// Step 1: Define the UserRepository interface
interface UserRepository {
    void addUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUser(int id);
}

// Step 2: Implement the UserRepository with a concrete class
class DatabaseUserRepository implements UserRepository {
    // Assume this class interacts with a database to perform CRUD operations

    @Override
    public void addUser(User user) {
        // Add user to the database
    }

    @Override
    public User getUserById(int id) {
        // Retrieve user from the database
        return null;
    }

    @Override
    public void updateUser(User user) {
        // Update user in the database
    }

    @Override
    public void deleteUser(int id) {
        // Delete user from the database
    }
}

// Step 3: Define the User class
class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

// Step 4: Client code that uses the UserRepository
public class Main {
    public static void main(String[] args) {
        // Create UserRepository instance (could be injected via dependency injection)
        UserRepository userRepository = new DatabaseUserRepository();

        // Perform CRUD operations
        User user1 = new User(1, "John");
        userRepository.addUser(user1);

        User retrievedUser = userRepository.getUserById(1);
        retrievedUser.setName("Updated Name");
        userRepository.updateUser(retrievedUser);

        userRepository.deleteUser(1);
    }
}
