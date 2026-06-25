import java.util.LinkedList;

public class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<String> users = new LinkedList<>();

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

         //getfirst and last
         System.out.println("First user: " + users.getFirst());
         System.out.println("Last user: " + users.getLast());

         //removefirst and last
            users.removeFirst();    
            users.removeLast();
            System.out.println("Users after removing first and last: " + users);

        users.add("John");
        users.add("Mike");
        users.addFirst("Alice");
        users.addLast("Bob");

            //Iterate - enhanced for loop  
        for(String user : users){

            System.out.println("User: " + user);
        }

        // Iterate - forEach with lambda
        users.forEach(user -> System.out.println("User: " + user));
        // Iterate - forEach with method reference
        users.forEach(System.out::println);

        // queue operations
        users.offer("Charlie");
        System.out.println("Users after offer: " + users);
        String polledUser = users.poll();
        System.out.println("Polled user: " + polledUser);   
        String peekedUser = users.peek();
        System.out.println("Peeked user: " + peekedUser);
        
    }
    
}