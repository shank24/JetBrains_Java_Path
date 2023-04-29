package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.Project;

import java.util.Scanner;

public class Sample_Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String str = scanner.nextLine();


        /*char ch[] = input.toCharArray();
        for(char ch1:ch){
            System.out.println(ch1 + " =  " +
                    String.format("%7s", Integer.toBinaryString(ch1))
                            .replace(" ","0"));

        }*/

        String binary;
        String formattedBinary;
        //char[] formBinCharArr;

        for (int ch : str.toCharArray()) {
            // TEST print ASCII decimal values
            // System.out.println(ch);
            // converting int to binary (Help: Integer.toBinaryString)
            binary = Integer.toBinaryString(ch);
            // TEST printing binary values
            // System.out.println(binary);
            // formatting binary to 7 digits (Help: String.format("%07d", binary)
            formattedBinary = String.format("%07d", Integer.parseInt(binary));
            // TEST printing formatted binary values
            //System.out.println(formattedBinary);
            // converting char to ChuckNorris-Code
            int[] intArray = new int[formattedBinary.length()];
            for (int i = 0; i < formattedBinary.length(); i++) {
                intArray[i] = Character.getNumericValue(formattedBinary.charAt(i));
                System.out.println(intArray[i]);
            }

        }
    }
}
