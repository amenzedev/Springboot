import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
    public static void main(String[] args){
        List<String> users = new ArrayList<>();

        // ADD
        users.add("John");
        users.add("Sarah");
        users.add("Mike");

        System.out.println("Users: " + users);

        //Get by index
        System.out.println("User at index 0: " + users.get(0)); 

        //Update
        users.set(1, "Samantha");
        System.out.println("Updated Users: " + users);

        //remove by index
        users.remove(2);
        System.out.println("Users after removal: " + users);

        //contains
        System.out.println("Contains John? " + users.contains("John"));

        //size 
         System.out.println("Size of users list: " + users.size());

         //Iterate - classic loop
         for(int i = 0; i < users.size(); i++){
            System.out.println("User at index " + i + ": " + users.get(i));
         }

            //Iterate - enhanced for loop  
        for(String user : users){

            System.out.println("User: " + user);
        }

        // Iterate - forEach with lambda
        users.forEach(user -> System.out.println("User: " + user));
        // Iterate - forEach with method reference
        users.forEach(System.out::println);
        
    }
    
}