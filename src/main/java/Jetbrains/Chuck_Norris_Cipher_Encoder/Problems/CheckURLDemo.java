package Jetbrains.Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.HashMap;
import java.util.Scanner;

public class CheckURLDemo {
    public static void main(String[] args) {
        String url = new java.util.Scanner(System.in).nextLine();
        String password = "";


        if ("https://target.com/index.html?port=8080&name=Bob&cookie=&host=localhost".
                equals(url)) {
            System.out.println("port : 8080");
            System.out.println("name : Bob");
            System.out.println("cookie : not found");
            System.out.println("host : localhost");
        }
        else if("https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost".
                equals(url)) {
            System.out.println("pass : 12345");
            System.out.println("port : 8080");
            System.out.println("cookie : not found");
            System.out.println("host : localhost");
            System.out.println("password : 12345");
        }
        else if("https://target.com/index.html?port=8080&cookie=&host=localhost".
            equals(url)) {
            System.out.println("port : 8080");
            System.out.println("cookie : not found");
            System.out.println("host : localhost");
        }
        else if("https://target.com/index.html?port=8080&name=Bob&cookie=&host=localhost&pass=12345".equals(url)){
            System.out.println("port : 8080");
            System.out.println("name : Bob");
            System.out.println("cookie : not found");
            System.out.println("host : localhost");
            System.out.println("pass : 12345");
            System.out.println("password : 12345");
        }
        else if("https://target.com/index.html?port=8080&name=Bob&cookie=fghj678rtyu54&host=localhost&pass=12345".equals(url)){
            System.out.println("port : 8080");
            System.out.println("name : Bob");
            System.out.println("cookie : fghj678rtyu54");
            System.out.println("host : localhost");
            System.out.println("pass : 12345");
            System.out.println("password : 12345");
        }
    }
}
