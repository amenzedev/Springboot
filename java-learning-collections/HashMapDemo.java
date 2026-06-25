import java.util.HashMap;
import java.util.Map;

public class HashMapDemo{
    public static void main(String[] args){
        Map<Integer, String> users = new HashMap<>();

        // add
        users.put(1, "John");
        users.put(2, "Sarah");
        users.put(3, "Mike");
        System.out.println("Users: " + users);


        // get by key
        System.out.println("User with key 1: " + users.get(1));

        // Check if key exists
        System.out.println("Contains key 2? " + users.containsKey(2));

        // Check if value exists    
        System.out.println("Contains value 'Mike'? " + users.containsValue("Mike"));    

        //Update
        users.put(2, "Samantha");
        System.out.println("Updated Users: " + users);

        //remove by key
        users.remove(3);
        System.out.println("Users after removal: " + users);

        //size 
         System.out.println("Size of users map: " + users.size());

         //Iterate - classic loop
         for(Map.Entry<Integer, String> entry : users.entrySet()){
            System.out.println("User with key " + entry.getKey() + ": " + entry.getValue());
         }

            //Iterate - enhanced for loop
        for(Integer key : users.keySet()){
            System.out.println("User with key " + key + ": " + users.get(key)); 
        }

        // Iterate keys
        for(Integer key : users.keySet()){
            System.out.println("Key: " + key);
        }

        // Iterate values
        for(String value : users.values()){
            System.out.println("Value: " + value);
        }


    }
}