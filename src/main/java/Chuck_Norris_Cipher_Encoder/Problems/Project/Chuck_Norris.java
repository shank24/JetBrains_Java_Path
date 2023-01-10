package Chuck_Norris_Cipher_Encoder.Problems.Project;

import java.util.Scanner;

public class Chuck_Norris {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        //System.out.println("> ");
        String input = scanner.nextLine();
        spacingString(input);
    }

    private static void spacingString(String input) {
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            System.out.print(x + " ");
        }
    }
}
