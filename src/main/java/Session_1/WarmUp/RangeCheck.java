package JetBrains_Academy.Session_1;

import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //(i1 >= i2 && i1 <= i3) || (i1 <= i2 && i1 >= i3)
        //System.out.println(((a<=b) && (c<=b)) || ((b<=a) && (a<=c)));
        System.out.println( (a >= b && a <= c) || (a <= b && a >= c));
    }
}
