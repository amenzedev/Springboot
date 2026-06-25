import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> emails = new HashSet<>();

        emails.add("john@email.com");
        emails.add("john@email.com");
        emails.add("sarah@email.com");

        System.out.println(emails);

        System.out.println(
                emails.contains("john@email.com")
        );

        emails.remove("john@email.com");

        System.out.println(emails);

        for(String email : emails){
            System.out.println(email);
        }
    }
}