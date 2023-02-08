package Chuck_Norris_Cipher_Encoder.Problems.Project;

import java.util.Scanner;

public class Sample_Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();

        char ch[] = input.toCharArray();
        for(char ch1:ch){
            System.out.println(ch1 + " =  " +
                    String.format("%7s", Integer.toBinaryString(ch1))
                            .replace(" ","0"));
        }

    }
}
