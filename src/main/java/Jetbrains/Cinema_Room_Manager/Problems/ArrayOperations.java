package Jetbrains.Cinema_Room_Manager.Problems;


class ArrayOperations {
    public static int[][][] createCube() {
        int size = 3;
        int[][][] array = new int[size][size][size];
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array[i][j][k] = counter;
                    counter++;
                }
            }
            counter = 0;
        }
        return array;
    }
}
