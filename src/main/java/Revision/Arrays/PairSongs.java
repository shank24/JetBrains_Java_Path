package Revision.Arrays;

import java.util.Scanner;

public class PairSongs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(getNumberofPairs(arr));
    }

    private static int getNumberofPairs(int[] arr) {
        if(arr.length==0)
            return 0;

        int count=0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                    if((arr[i] + arr[j]) %60 == 0){
                        count++;
                    }
            }
        }
        return count;
    }
}
