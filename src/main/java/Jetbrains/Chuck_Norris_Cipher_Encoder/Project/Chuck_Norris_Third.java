package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.Project;

import java.util.Scanner;

public class Chuck_Norris_Third {

    public static void main(String[] args) {
        // Input
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.print("\nThe result:\n");

        // Instantiating variables for loop
        String binary;
        String formattedBinary;
        char[] formBinCharArr;
        //**************************************************************************************************************
        int counter = 0; //Adding a new counter variable to 'catch' every 7th loop************************************
        //**************************************************************************************************************
        // Converting the String to a char array
        // Looping through all character while
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
            }
            if (0 == intArray[0]) {
                //System.out.print("00 0");//only every 7th must start without a whitespace*****************************
                //******************************************************************************************************
                System.out.print(String.format("%s00 0", counter % 7 == 0 ? "" : " "));//every 7th is a new block*******
                //******************************************************************************************************
            } else if ((int) intArray[0] == 1) {
                //System.out.print("0 0");//only every 7th must start without a whitespace******************************
                //******************************************************************************************************
                System.out.print(String.format("%s0 0", counter % 7 == 0 ? "" : " "));//every 7th is a new block********
                //******************************************************************************************************
            } else {
                System.out.print("ERROR");
            }
            //**********************************************************************************************************
            counter++;//Need to increment the value of the counter******************************************************
            //**********************************************************************************************************
            // 1. go through each character individually
            // for (int i = 1; )
            int previous = intArray[0];
            for (int i = 1; i < intArray.length; i++) {
                // if 0, and before 1 then print " 00 0"
                if (intArray[i] == 0 && previous == 1) {
                    System.out.print(" 00 0");
                    // if 0, and before 0, dann print "0"
                } else if (intArray[i] == 0 && previous == 0) {
                    System.out.print("0");
                    // if 1, ...
                } else if (intArray[i] == 1 && previous == 0) {
                    System.out.print(" 0 0");
                } else if (intArray[i] == 1 && previous == 1) {
                    System.out.print("0");
                }
                // save previous Element,
                previous = intArray[i];
            }

        }
    }
}
