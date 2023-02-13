package Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.Scanner;

public class CheckURLs {
    public static void main(String[] args) {
        //String []url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost".split("[=&?]",-1);

        //String url = new java.util.Scanner(System.in).nextLine();
        //String password = "";

        Scanner sc = new Scanner(System.in);
        String[] url = sc.nextLine().split("\\?");
        String[] params = url[1].split("\\&");

        for (String value : params) {
            System.out.println(value);
        }

        /*for(String values : url) {
            System.out.println(values);
            *//*if(values.contains("pass")){
                //System.out.print();
            }*//*
        }*/
    }
}
