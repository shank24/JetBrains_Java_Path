package Session_2;

import java.util.Scanner;

public class IncomeSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompanies = scanner.nextInt();

        double[] incomes = fillValuesForArr(numberOfCompanies, scanner);
        double[] taxesInPercent = fillValuesForArr(numberOfCompanies, scanner);

        scanner.close();

        int index = 0;
        double max = getTaxes(incomes[0], taxesInPercent[0]);

        for(int x = 1; x < numberOfCompanies; x++) {
            double temp = getTaxes(incomes[x], taxesInPercent[x]);
            if (max < temp) {
                max = temp;
                index = x;
            }
        }

        System.out.print(index + 1);
    }

    public static double[] fillValuesForArr(int len, Scanner scanner) {
        double[] result = new double[len];
        for (int i = 0; i < len; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public static double getTaxes(double income, double taxesInPercent) {
        return (1.0 * (int)taxesInPercent * income / 100);
    }
}
