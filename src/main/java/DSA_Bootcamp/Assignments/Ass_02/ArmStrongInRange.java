package DSA_Bootcamp.Assignments.Ass_02;

import java.util.Scanner;

public class ArmStrongInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        getArmstrongNumbers(start,end);
    }

    private static void getArmstrongNumbers(int start, int end) {
        for (int i = start; i <=end; i++) {
            checkArmStrong(i);
        }
    }

    private static void checkArmStrong(int i) {
        int originalNum = i;
        int rem=0,num=0;
        while(i!=0){
            rem = i%10;
            num = num + rem*rem*rem;
            i/=10;
        }
        if(num==originalNum)
            System.out.println(num);
    }

}
