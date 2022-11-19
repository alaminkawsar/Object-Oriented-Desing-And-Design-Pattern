import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        User john = new User("John");
        User robin = new User("Robin");

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
    
        john.sendMessage(message);
        robin.sendMessage("Hello Mr John");
    }

    
}
