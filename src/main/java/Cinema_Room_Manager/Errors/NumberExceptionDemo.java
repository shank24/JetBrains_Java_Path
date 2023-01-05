package Cinema_Room_Manager.Errors;

import java.util.Scanner;

public class NumberExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // it checks if the input line contains only digits
        if(input.matches("\\d+")){
            int number = Integer.parseInt(input);
            System.out.println(number+1);
        }
        else {
            System.out.println("Incorrect number: " + input);
        }

    }
}
