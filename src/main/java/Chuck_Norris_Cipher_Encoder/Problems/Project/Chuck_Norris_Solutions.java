package Chuck_Norris_Cipher_Encoder.Problems.Project;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Chuck_Norris_Solutions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String message = scanner.nextLine();
        StringBuilder binaryMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            binaryMessage.append(String.format("%07d", Integer.parseInt(Integer.toBinaryString(c))));
        }
        Pattern p = Pattern.compile("(0+|1+)");
        Matcher m = p.matcher(binaryMessage);
        StringBuilder result = new StringBuilder();
        while (m.find())
            result.append(m.group().contains("1") ? "0" : "00").append(" ").append("0".repeat(m.group().length())).append(" ");
        System.out.printf("The result:\n%s%n", result);
    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");
        String strInput = scanner.nextLine();
        int strInputLength = strInput.length();

        System.out.println("The result:");
        String strBinary = "";

        for (int i = 0; i < strInputLength; i++) {
            String charFromStrInputInBinary = Integer.toBinaryString(strInput.charAt(i));

            // convert charFromStrInputInBinary to 7 bit form (0110 -> 0000110)
            strBinary = strBinary + String.format("%7s", charFromStrInputInBinary).replace(" ", "0");
        }

        int strBinaryLength = strBinary.length();
        String strEncrypted = "";

        for (int k = 0; k < strBinaryLength;) {
            if (strBinary.charAt(k) == '1') {
                strEncrypted = strEncrypted + "0 ";

                while (k < strBinaryLength) {
                    if (strBinary.charAt(k) == '1') {
                        strEncrypted = strEncrypted + "0";
                        k++;
                    } else {
                        strEncrypted = strEncrypted + " ";
                        break;
                    }
                }
            } else {
                strEncrypted = strEncrypted + "00 ";

                while (k < strBinaryLength) {
                    if (strBinary.charAt(k) == '0') {
                        strEncrypted = strEncrypted + "0";
                        k++;
                    } else {
                        strEncrypted = strEncrypted + " ";
                        break;
                    }
                }
            }
        }
        System.out.print(strEncrypted);
    }
 */

/*
public class Main {
    private static final String SAME_CONSECUTIVE_CHAR_GROUPINGS_REGEX = "(.)\\1*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");
        char[] inputChars = scanner.nextLine().toCharArray();

        StringBuffer inputAsBinaryString = new StringBuffer();
        for (char c : inputChars) {
            inputAsBinaryString.append(convertToBinary(c));
        }

        StringBuffer encodedString = new StringBuffer();
        Pattern pattern = Pattern.compile(SAME_CONSECUTIVE_CHAR_GROUPINGS_REGEX);
        Matcher matcher = pattern.matcher(inputAsBinaryString);
        while (matcher.find()) {
            encodedString.append(norrisEncode(matcher.group()));
        }

        System.out.println("The result:");
        System.out.println(encodedString);
    }

    private static CharSequence norrisEncode(String digitSequence) {
        StringBuffer encodedString = new StringBuffer(digitSequence.charAt(0) == '0' ? "00 " : "0 ");
        encodedString.append("0".repeat(digitSequence.length()));
        encodedString.append(' ');
        return encodedString;
    }

    private static String convertToBinary(int c) {
        return String.format("%7s", Integer.toBinaryString(c)).replace(" ", "0");
    }
}
*/

/*
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        char[] userInput = scanner.nextLine().toCharArray();
        String userBinary = "";
        for (char c : userInput) {
            userBinary += String.format("%7s",Integer.toBinaryString(c)).replace(" ", "0");
        }
        userInput = userBinary.toCharArray();
        char previous = 'n'; // first value
        String printString = "";
        for (int i = 0; i < userInput.length; i++) {
            if (i != 0) {
                previous = userInput[i - 1];
                if (userInput[i] == previous) {
                    printString += "0";
                } else {
                    if (userInput[i] == '1') {
                        printString += " 0 0";
                    } else {
                        printString += " 00 0";
                    }
                }
            }
            if (i == 0) {
                if (userInput[0] == '1') {
                    printString += "0 0";
                } else {
                    printString += "00 0";
                }
            }
        }
        System.out.printf("The result:%n%s", printString);
    }
}
 */

