package DSA_Bootcamp.Assignments.Ass_01;

import java.util.Scanner;

public class ComputeLCMnHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println(getLCM(n1,n2));
    }

    private static int getLCM(int n1, int n2) {
        int result = 0;
        for (int i = 1; i<n1*n2; i++){
            if(i%n1 == 0 && i%n2 == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}
