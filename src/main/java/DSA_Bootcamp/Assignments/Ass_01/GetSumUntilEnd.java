package DSA_Bootcamp.Assignments.Ass_01;

import java.util.Scanner;

public class GetSumUntilEnd {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(computeSum());
    }

    private static int computeSum() {
        int sum=0;
        int n1 =0;

        while(true){
            System.out.println("Enter 'x' to quit");
            char op = in.next().trim().toLowerCase().charAt(0);
            if(op == 'x'){
                break;
            }else{
                n1 = in.nextInt();
                sum += n1;
            }
        }
        return sum;
    }
}
