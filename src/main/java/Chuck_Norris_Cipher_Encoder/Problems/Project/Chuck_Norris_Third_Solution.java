package Chuck_Norris_Cipher_Encoder.Problems.Project;

import java.util.Scanner;

public class Chuck_Norris_Third_Solution {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");
        char[] str = scanner.nextLine().toCharArray();
        String converted = "";

        System.out.println();
        System.out.println("The result:");

        for (char i : str)
        {
            converted += String.format("%7s", Integer.toBinaryString(i)).replace(" ", "0");
        }
        encryption(converted);
    }

    public static void encryption(String converted)
    {
        int i = 0;
        char currentChar;

        while (i < converted.length())
        {
            if (converted.charAt(i) == '0')
            {
                System.out.print("00 ");
                currentChar = '0';
            }
            else
            {
                System.out.print("0 ");
                currentChar = '1';
            }

            while (converted.charAt(i) == currentChar)
            {
                System.out.print("0");
                i++;
                if (i == converted.length()) break;
            }

            if (i < converted.length()) System.out.print(" ");
        }
    }
}

/*

Problem

Description
Binary with 0 and 1 is good, but binary with only 0 is even better! This encoding has a name — the Chuck Norris Unary Code.

Let's convert our text into a sequence of zeros and spaces!

Objectives
The encoding principle is simple. The input message consists of ASCII characters (7-bit). You need to transform the text into the sequence of 0 and 1 and use the Chuck Norris technique. The encoded output message consists of blocks of 0. A block is separated from another block by a space.

Two consecutive blocks are used to produce a series of the same value bits (only 1 or0 values):

First block: it is always 0 or 00. If it is 0, then the series contains 1, if not, it contains 0
Second block: the number of 0 in this block is the number of bits in the series
Let's take a simple example with a message which consists of only one character C. The C symbol in binary is represented as 1000011, so with Chuck Norris technique this gives:

0 0 (the first series consists of only a single 1);
00 0000 (the second series consists of four 0);
0 00 (the third consists of two 1)
So C is coded as: 0 0 00 0000 0 00
Make sure, that an encoding of a single character sequence is not separated. For example, 000 should be encoded as 00 000 and not as 00 0 00 0 00 0 or 00 0 00 00 or 00 00 00 0

In this stage, your program should:

Read a string from a console. The input contains a single line.
Print The result: line, followed by a line with an encoded message.
Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1:

Input string:
> C

The result:
0 0 00 0000 0 00
Example 2:

Input string:
> CC

The result:
0 0 00 0000 0 000 00 0000 0 00
Example 3:

Input string:
> Hi <3

The result:
0 0 00 00 0 0 00 000 0 00 00 0 0 0 00 00 0 0 00 0 0 0 00 000000 0 0000 00 000 0 00 00 00 0 00

 */