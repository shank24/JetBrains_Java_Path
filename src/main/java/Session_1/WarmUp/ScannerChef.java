package Session_1;

import java.util.Scanner;

public class ScannerChef {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int experience = Integer.parseInt(scanner.next());
        String fusion = scanner.next();

        System.out.println("The form for " + name + "is completed. We will contact you if we need a chef who cooks " + fusion + " dishes and has " +  experience + " years of experience.");

    }
}
