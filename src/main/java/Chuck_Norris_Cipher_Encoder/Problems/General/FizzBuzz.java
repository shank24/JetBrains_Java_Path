package Chuck_Norris_Cipher_Encoder.Problems.General;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        List<String> strings = fizzBuzz(number);
        System.out.println(strings);

    }

    public static List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<String>();

        for (int i=1 ;i<=n; i++){
            if(i%3 ==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i%5 == 0){
                result.add("Buzz");
            }
            else if(i%3==0){
                result.add("Fizz");
            }
            else{
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

*/
