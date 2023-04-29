package Jetbrains.Simple_ChatBot.WarmUp;

import java.util.Calendar;

public class SimpleBot {
    /**
     * The main method accepts an array of string arguments
     *
     * @param args from the command line
     */
    public static void main(String[] args) {

        /*
        Hello! My name is {botName}.
        I was created in {birthYear}.
         */

        System.out.println("Hello! My name is Shanky");
        System.out.println("I was created in "+ Calendar.getInstance().get(Calendar.YEAR));

        String value = "String value";
        String value1 = "String value";
        System.out.println(value.intern());
        System.out.println(value1.intern());


    }
}
