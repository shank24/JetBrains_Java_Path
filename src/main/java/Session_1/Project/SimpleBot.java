package JetBrains_Academy.Bots;

import java.util.Scanner;

public class SimpleBot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Shank.");
        System.out.println("I was created in 1989.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " +  age + ";" + " that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int range = scanner.nextInt();
        for (int i = 0; i <= range; i++) {
            System.out.println(i+"!");
        }

    }
}
