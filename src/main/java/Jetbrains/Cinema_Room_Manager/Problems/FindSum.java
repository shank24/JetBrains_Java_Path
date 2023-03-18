package Jetbrains.Cinema_Room_Manager.Problems;

public class FindSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,};

        findSumWay1(arr);
        findSumWay2(arr);
        findSumWay3(arr);
        findSumWay4(arr);
    }

    private static void findSumWay1(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    private static void findSumWay2(int[] numbers) {
        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    private static void findSumWay3(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void findSumWay4(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

}
