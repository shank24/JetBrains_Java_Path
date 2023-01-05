package Cinema_Room_Manager.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class CodeCheck {
    final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int sides = SCANNER.nextInt();

        int [] box1_Dimensions = new int[sides];
        int [] box2_Dimensions = new int[sides];

        //Input Sides For Box_1
        for (int i = 0; i < sides; i++) {
            box1_Dimensions[i] = SCANNER.nextInt();
        }

        //Input Sides For Box_2
        for (int i = 0; i < sides; i++) {
            box2_Dimensions[i] = SCANNER.nextInt();
        }

        //Sorting Arrays.
        Arrays.sort(box1_Dimensions);
        Arrays.sort(box2_Dimensions);

        boolean box1small = true, box2small = true;

        for (int i = 0; i < box1_Dimensions.length; i++) {
            if (box1_Dimensions[i] <= box2_Dimensions[i]) {
                box2small = false;
            }
            if (box2_Dimensions[i] <= box1_Dimensions[i]) {
                box1small = false;
            }
        }


        if(box1small) {
            System.out.println("Box 1 < Box 2");
        }
        else if(box2small) {
            System.out.println("Box 1 > Box 2");
        }
        else {
            System.out.println("Incompatible");
        }
    }
}
