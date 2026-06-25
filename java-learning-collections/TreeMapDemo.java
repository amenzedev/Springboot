import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> users =
                new TreeMap<>();

        users.put(3,"Mike");
        users.put(1,"John");
        users.put(2,"Sarah");

        System.out.println(users);

        System.out.println(
                users.get(2)
        );

        users.remove(3);

        System.out.println(users);

        for(Map.Entry<Integer,String> entry :
                users.entrySet()) {

            System.out.println(
                    entry.getKey() +
                    " -> " +
                    entry.getValue()
            );
        }

        System.out.println(
                users.firstKey()
        );

        System.out.println(
                users.lastKey()
        );
    }
}