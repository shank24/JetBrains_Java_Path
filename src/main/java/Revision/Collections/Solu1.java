package Revision.Collections;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxTrailing' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int maxTrailing(List<Integer> arr) {
        int max=arr.get(1) - arr.get(0);

        for(int k=0;k<arr.size();k++){
            for(int t=k+1;t<arr.size();t++){
                if(arr.get(k)>arr.get(t)){
                    max=-1;
                }
            }
        }


        int i,j;

        for(i=0;i<arr.size();i++){
            for(j=i+1; j<arr.size();j++){
                int diff = arr.get(j) - arr.get(i);
                if( diff > max){
                    max = diff;
                }
            }
        }


        return max;
    }
    }

public class Solu1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.maxTrailing(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
