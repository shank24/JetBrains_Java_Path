package Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//upper
        int b = sc.nextInt();//lower
        int c = sc.nextInt();//digits
        int n = sc.nextInt();//length

        List<Character> list = new ArrayList<Character>();
        while (list.size() < n){
            addUpper(a,list);
            addLower(b,list);
            addNumbers(c,list);
        }

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < n; i++){
            builder.append(list.toArray()[i]);
        }
        System.out.println(builder.toString());
    }

    public static Character createRandomSymbol() {
        return (char) (new Random().nextInt(26) + 'a');
    }

    public static void addUpper(int a, List<Character> list) {
        for (int i = 0; i < a; i++) {
            list.add(Character.toUpperCase(createRandomSymbol()));
        }
    }

    public static void addLower(int b, List<Character> list) {
        for (int i = 0; i < b; i++) {
            list.add(Character.toLowerCase(createRandomSymbol()));
        }
    }

    public static void addNumbers(int c, List<Character> list) {
        for (int i = 0; i < c; i++) {
            list.add(Character.forDigit(new Random().nextInt(10), 10));
        }
    }
}
