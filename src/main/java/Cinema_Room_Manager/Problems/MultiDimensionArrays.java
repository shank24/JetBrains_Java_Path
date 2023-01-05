package Cinema_Room_Manager.Problems;

import java.util.Scanner;

public class MultiDimensionArrays {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[][][] resultCube = createCube();

    }

    private static int[][][] createCube() {
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int elements = scanner.nextInt();

        int [][][] array = new int[rows][columns][elements];

        int count = 0;
        for (int i = 0; i <array.length; i++) {
            count = 0;
            for (int j = 0; j <array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = count++;
                }
            }
        }

        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    System.out.println(array[i][j][k]);
                }
            }
        }

        return array;
    }
}
