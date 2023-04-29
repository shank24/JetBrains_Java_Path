package Jetbrains.Cinema_Room_Manager.Warmup;

import java.util.Scanner;

public class InputSequence {

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        countSequence();
    }

    private static void countSequence() {
        int number = scanner.nextInt();
        int count = 0;
        do{
            if(number == 0){
                break;
            }
            else{
                number = scanner.nextInt();
                count ++;
            }
        }while(true);

        System.out.println(count);
    }
}
