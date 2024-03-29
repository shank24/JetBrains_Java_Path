package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.Problems;

public class Unique_Strings {
    public static void main(String[] args) {
        String str1 = "aaabbcccdaa";
        String str2 = " ";

        getUniqueString(str1,str2);
    }

    private static void getUniqueString(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
        System.out.println(str2);
    }
}
