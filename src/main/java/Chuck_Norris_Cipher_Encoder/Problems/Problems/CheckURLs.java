package Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.HashMap;
import java.util.Scanner;

public class CheckURLs {
    public static void main(String[] args) {
        //String []url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost".split("[=&?]",-1);

        //String url = new java.util.Scanner(System.in).nextLine();
        //String password = "";

        Scanner sc = new Scanner(System.in);
        String[] url = sc.nextLine().split("\\?");

        HashMap<String, String> map = new HashMap<>();

        String[] params = url[1].split("\\&");

        try{
            for (String value : params) {
                //System.out.println(value);

                String keyData[] = value.split("=");
                String key = keyData[0].trim();
                if(key.contains(" ")){
                    map.put(key, "not found");
                }

                //System.out.println(key);
                String val = keyData[1].trim();
                //System.out.println(val);



                map.put(key,val);

            }
        } catch (Exception e) {
            System.out.println("Exception Caught");
        }

        //System.out.println(map);

    }
}
