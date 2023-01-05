package Simple_ChatBot_Project;

import java.util.Scanner;

public class Scanner_Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        String name4 = scanner.next();

        System.out.println(name4);
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);

        Scanner scanner = new Scanner(System.in);
*/
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String yourName = scanner.next();
        System.out.println("What a great name you have "+ yourName + "!");
    }
}
