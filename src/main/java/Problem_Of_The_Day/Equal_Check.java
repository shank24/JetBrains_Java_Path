package Problem_Of_The_Day;

import java.util.Scanner;

public class Equal_Check {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

            equalityCheck(number1, number2, number3);

    }

    private static void equalityCheck(int number1, int number2, int number3) {
        if(number1 == number2 && number2 == number3 && number3 == number1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

}
