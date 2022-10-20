package WarmUp;

import java.util.Scanner;

public class SumCheck {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        calculateSumCheck();
    }

    private static void calculateSumCheck() {

        int sum = 0;

        for( int i=0; ; i++) {
            int userInput = SCANNER.nextInt();
            if(userInput == 0 || sum >= 1000) {
                break;
            }
            sum = sum + userInput;
        }


        if (sum >= 1000) {
            sum = sum - 1000;
            System.out.println(sum);
        } else {
            System.out.println(sum);
        }
    }
}
