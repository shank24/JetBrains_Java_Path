package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.Scanner;

public class GenerateRandomPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many passwords you want to generate ");
        int total = in.nextInt();
        System.out.println("How many characters long password should be ?");
        int length = in.nextInt();

        String [] randomPasswords = new String[total];

        //Loop through total number of passwords
        for(int i = 0; i < total; i++){
            //Generate one random password
            String randomPassword = "";
            for(int j = 0; j < length; j++){
                //Generate one random character
                randomPassword +=  randomCharacter();
            }
            //Add random Password
            randomPasswords[i] = randomPassword;
        }

        //Print array of Passwords
        printPasswords(randomPasswords);
    }

    public static void printPasswords(String[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    //0-9 => 48-57 ASCII
    //A-Z => 65-90 ASCII
    //a-z => 97-122 ASCII

    public static char randomCharacter(){
//Generate a random number that represents all possible
// characters in our password
//10 dig + 26 lower + 26 upper => 62 characters

        int rand = (int)(Math.random()*62);

        //rand is btwn 0-9 => digit => 48-57
        if(rand<=9){
            int ascii = rand + 48;
            return (char)(ascii);
        }
        //uppercase {65-90}
        else if(rand<=35){
            int ascii = rand + 55; //65 -10 => 55
            return (char)(ascii);
        }
        //lowercase {97-122}
        else{
            int ascii = rand + 61; //97 -36 => 55
            return (char)(ascii);
        }

    }
}
