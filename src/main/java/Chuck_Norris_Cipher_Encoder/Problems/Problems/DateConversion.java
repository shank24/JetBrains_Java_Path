package Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateConversion {
    public static void main(String[] args) {
        String date = "2012-09-28";
        String [] dateArray = date.split("-");
        String join = String.join("/", Arrays.asList(dateArray[1],dateArray[2],dateArray[0]));
        System.out.println(join);

        int month = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[0]);
        int dates = Integer.parseInt(dateArray[2]);

        //String europeanDatePattern = "MM/dd/yyyy";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(europeanDateFormatter.format(LocalDate.of(year, month, dates)));


    }

    private static void extractInMMDDYYYYFormat(String[] dateArray) {

        int month = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[0]);
        int date = Integer.parseInt(dateArray[2]);

        if((month >1 || month <=12) && (date >1 || date<=31)  ){
            System.out.println(month+"/"+date+"/"+year);
        }

        /*System.out.println(LocalDate.of(date).format("MM/DD/YYYY"));

        String[] dateArray = date.split("-");
        System.out.println(dateArray[1]+"/"+dateArray[2]+"/"+dateArray[0]);
        extractInMMDDYYYYFormat(dateArray);*/

        /*DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(String.valueOf(dateTimeFormatter));
        System.out.println(formattedDate);*/
    }
}

/*
Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.

For instance, the input 2007-07-21 will result in the following output 07/21/2007.
 */
