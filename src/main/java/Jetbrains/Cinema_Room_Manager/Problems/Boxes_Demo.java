package Jetbrains.Cinema_Room_Manager.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Boxes_Demo {
    final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        //int sides = SCANNER.nextInt();

        int [] box1_Dimensions = new int[3];
        int [] box2_Dimensions = new int[3];

        //Input Sides For Box_1
        for (int i = 0; i < box1_Dimensions.length; i++) {
            box1_Dimensions[i] = SCANNER.nextInt();
        }

        //Input Sides For Box_2
        for (int i = 0; i < box2_Dimensions.length; i++) {
            box2_Dimensions[i] = SCANNER.nextInt();
        }

        //Sorting Arrays.
        Arrays.sort(box1_Dimensions);
        Arrays.sort(box2_Dimensions);

        if (box1_Dimensions[0] < box2_Dimensions[0] && box1_Dimensions[1] < box2_Dimensions[1] && box1_Dimensions[2] < box2_Dimensions[2]) {
                System.out.println("Box 1 < Box 2");
        }

        else if (box2_Dimensions[0] < box1_Dimensions[0] && box2_Dimensions[1] < box1_Dimensions[1] && box2_Dimensions[2] < box1_Dimensions[2]) {
            System.out.println("Box 1 > Box 2");
        }
        else{
            System.out.println("Incompatible");
        }



        /*if(box1small && counter == 3) {
            System.out.println("Box 1 < Box 2");
        }
        else if(box2small && counter == 3) {
            System.out.println("Box 1 > Box 2");
        }
        else {
            System.out.println("Incompatible");
        }*/
    }
}
