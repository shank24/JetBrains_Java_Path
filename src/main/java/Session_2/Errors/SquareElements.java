package Session_2.Errors;

import java.util.Scanner;

public class SquareElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        int arr[] = new int[range];
        for (int i = 0; i < range; i++) {
            arr[i] = scanner.nextInt();
        }

        int index = scanner.nextInt();

        calculateSquare(arr,index);
    }


    public static void calculateSquare(int[] array, int index) {
        // write your code here

        if(array == null || array.length<0 || index > array.length-1 || index < 0){
            System.out.println("Exception!");
        }
        else{
            System.out.println((int)Math.pow(array[index],2));
        }

    }
}
