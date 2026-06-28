import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1L, "Alive", true));
        users.add(new User(2L, "Charlie", false));
        users.add(new User(3L, "Bob", true));
        // users.add(new User(null, "", false));

        validateUsers(users);

        printUsers(users);

        printActiveUsers(users);

        sortUsers(users);

        List<String> names = users.stream()
        .filter(User::isActive)
        .map(User::getName)
        .filter(name -> name != null)
        .distinct()
        .toList();

        names.forEach(System.out::println);

    }

    public static void validateUsers(List<User> users){

        for (User user: users) {
            if (user.getId() == null){
                throw new IllegalArgumentException("User id cannot be null");
            }
        }
    }

    public static void printUsers(List<User> users){
        System.out.println("All users:");

        users.forEach(user -> System.out.println(user.getName()));
    }

    public static void printActiveUsers(List<User> users){
        System.out.println("Active users:");

        users.stream()
                .filter(User::isActive)
                .forEach(user -> System.out.println(user.getName()));

    }

    public static void sortUsers(List<User> users){

        users.sort(
            (u1, u2) -> u1.getName().compareTo(u2.getName())
        );

        System.out.println("Sorted users:");
        users.forEach(System.out::println);
    }
        
}