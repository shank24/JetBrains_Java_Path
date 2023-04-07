package Jetbrains.Chuck_Norris_Cipher_Encoder.Project;

import java.util.Scanner;

public class Chuck_Norris_Fourth_Sol_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String inputString = scanner.nextLine();

        System.out.println("The result:");
        chuckNorrisDecode(inputString);

    }

    private static void chuckNorrisDecode(String inputString) {
        String decodedBinary = decodeToBinary(inputString);
        String decodedMsg = messageDecode(decodedBinary);
        System.out.println(decodedMsg);
    }

    private static String messageDecode(String decodedBinary) {
        String[] decodedBinaryArray = new String[decodedBinary.length() / 7];

        int decodeArrayCount = 0;
        for (int i = 0; i < decodedBinary.length() - 6; i += 7) {
            decodedBinaryArray[decodeArrayCount] = decodedBinary.substring(i, i + 7);
            decodeArrayCount++;
        }

        StringBuilder decodedMsg = new StringBuilder();
        for (String s : decodedBinaryArray) {
            int binary = Integer.parseInt(s, 2);
            decodedMsg.append(Character.toChars(binary));
        }

        return decodedMsg.toString();
    }

    private static String decodeToBinary(String inputString) {
        String[] inputStringArray = inputString.split(" ");
        StringBuilder decodeBinary = new StringBuilder();
        for (int i = 0; i < inputStringArray.length; i += 2) {
            String checkDigit;
            if ("0".equals(inputStringArray[i])) {
                checkDigit = "1";
                decodeBinary.append(checkDigit.repeat(inputStringArray[i + 1].length()));
            } else {
                checkDigit = "0";
                decodeBinary.append(checkDigit.repeat(inputStringArray[i + 1].length()));
            }
        }
        return decodeBinary.toString();
    }

    private static void chuckNorrisEncoding(String inputString) {
        String one = "0";
        String zero = "00";
        StringBuilder afterEncode = new StringBuilder();
        StringBuilder beforeEncode = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            beforeEncode.append(charToBinary(inputString.charAt(i)));
        }


        for (int j = 0; j < beforeEncode.length(); j++) {
            char checkDigit = beforeEncode.charAt(j);
            if (checkDigit == '1') {
                afterEncode.append(one);
            } else {
                afterEncode.append(zero);
            }
            int digitCount = 1;
            for (int k = j + 1; k < beforeEncode.length(); k++) {
                if (checkDigit == beforeEncode.charAt(k)) {
                    digitCount++;
                } else {
                    break;
                }
            }

            afterEncode.append(" ");
            for (int m = 0; m < digitCount; m++) {
                afterEncode.append("0");
            }
            afterEncode.append(" ");

            j += digitCount - 1;
        }
        System.out.println(afterEncode);
    }

    private static String charToBinary(char myChar) {
        String binaryString = Integer.toBinaryString(myChar);
        return String.format("%07d", Integer.parseInt(binaryString));
    }

}
