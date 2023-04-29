package DSA_Bootcamp.Assignments.Ass_01;

import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        addOperation(n1, n2);
        subOperation(n1, n2);
        mulOperation(n1,n2);
    }

    private static void addOperation(int n1, int n2) {
        Operator<Integer> addOperationVar = (a,b) -> a+b;
        System.out.println(addOperationVar.process(n1, n2));
    }

    private static void subOperation(int n1, int n2) {
        Operator<Integer> subOperationVar = (a,b) -> a-b;
        System.out.println(subOperationVar.process(n1, n2));
    }

    private static void mulOperation(int n1, int n2) {
        Operator<Integer> mulOperationVar = (a,b) -> a*b;
        System.out.println(mulOperationVar.process(n1, n2));
    }
}
