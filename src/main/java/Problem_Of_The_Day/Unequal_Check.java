package Problem_Of_The_Day;

import java.util.Scanner;

public class Unequal_Check {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

            unequalityCheck(number1, number2, number3);

    }

    private static void unequalityCheck(int number1, int number2, int number3) {
        if(number1 != number2 && number2 != number3 && number3 != number1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

}
