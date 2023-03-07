package Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.Scanner;

public class GenerateRandomPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many passwords you want to generate ");
        int total = in.nextInt();
        System.out.println("How many characters long password should be ?");
        int length = in.nextInt();

    }

    //0-9 => 48-57 ASCII
    //A-Z => 65-90 ASCII
    //a-z => 97-122 ASCII

    public static char randomCharacter(){
//Generate a random number that represents all possible
// characters in our password
//10 dig + 26 lower + 26 upper => 62 characters

        int rand = (int)(Math.random()*62);

    }
}
