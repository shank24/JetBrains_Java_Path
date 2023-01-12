package Chuck_Norris_Cipher_Encoder.Problems.Project;

import java.util.Scanner;

public class Chuck_Norris_Second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();
        System.out.println("The result:");
        extractingChar(input);

    }

    private static void extractingChar(String input) {
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            convertToBinary(x);
        }
    }

    private static void convertToBinary(char x) {
        System.out.println(x + " = " + String.format("%7s",Integer.toBinaryString(x)).replace(" ", "0"));
    }

}

//Failed Approach, but still learned something
//System.out.printf("%c =  %07d",x,Integer.parseInt(x));
//System.out.println(x + " = ",String.format("%c" + " = " + "%7s",x,Integer.toBinaryString(x)).replace(" ", "0"));