package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGeneratorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//upper
        int b = sc.nextInt();//lower
        int c = sc.nextInt();//digits
        int n = sc.nextInt();//length

            String randomPassword = "";
            for(int j = 0; j < n; j++){
                //Generate one random character
                randomPassword +=  randomCharacter(a,b,c);
            }
        System.out.println(randomPassword);
    }

    public static char randomCharacter(int a, int b, int c){
//Generate a random number that represents all possible
// characters in our password
//10 dig + 26 lower + 26 upper => 62 characters

        int rand = (int)(Math.random()*62);
        int ascii = 0;
            //rand is btwn 0-9 => digit => 48-57
            for (int i =0;i<c;i++){
                if(rand<=9){
                    ascii = rand + 48;
                    //return (char)(ascii);
                }
            }

            //uppercase {65-90}
            for (int i = 0;i<a; i++){
                if(rand<=35){
                    ascii = rand + 55; //65 -10 => 55
                    //return (char)(ascii);
                }
            }

            //lowercase {97-122}
            for (int i = 0;i<b; i++) {
                if(rand<=61){
                    ascii = rand + 61; //97 -36 => 55

                }
            }
        return (char)(ascii);

    }
}
