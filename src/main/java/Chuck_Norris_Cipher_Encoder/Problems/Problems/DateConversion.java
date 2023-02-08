package Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class DateConversion {
    public static void main(String[] args) {
        String[] date = new Scanner(System.in).next().split("-");
        String join = String.join("/", Arrays.asList(date[1], date[2], date[0]));
        System.out.println(join);
    }
}


/*
Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.

For instance, the input 2007-07-21 will result in the following output 07/21/2007.
 */
