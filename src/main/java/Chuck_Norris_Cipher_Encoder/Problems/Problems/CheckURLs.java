package Chuck_Norris_Cipher_Encoder.Problems.Problems;

import java.util.ArrayList;
import java.util.Arrays;
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
        String key = "";
        String val = "";


        try{
            for (String value : params) {
            ArrayList<String> arr = new ArrayList<>(Arrays.asList(params));
                if(arr.get(2) == ("cookie")){
                    arr.add("not found");
                }
                System.out.println(arr);

                //System.out.println(value);


                /*String keyData[] = value.split("=");
                key = keyData[0].trim();
                System.out.println(key);

                if(key.contains("cookie")){
                    keyData[1] = " ";
                }
                val = keyData[1].trim();
                System.out.println(val);

                map.put(key,val);*/
            }
        }
        catch (Exception e) {
            //map.put(key, "not found");
            //System.out.println("Exception Caught");
        }

        System.out.println(map);

    }
}
