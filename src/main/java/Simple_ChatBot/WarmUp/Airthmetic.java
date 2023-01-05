package Simple_ChatBot_Project;

import java.util.Scanner;

public class Airthmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(((n + 1) * n + 2) * n + 3);


        int m = 0;
        System.out.print(++m);
        System.out.print(m++);
        System.out.print(m++);

        char c = '1' + '3';
        System.out.println(c);
    }
}
