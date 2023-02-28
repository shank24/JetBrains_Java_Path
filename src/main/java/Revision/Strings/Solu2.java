package Revision.Strings;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'numberOfWays' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY queries as parameter.
     */

    public static List<Optional<List<Long>>> numberOfWays(List<List<Integer>> queries) {
        List<Optional<List<Long>>> data = new ArrayList<>();

        for (long i = 0; i < queries.size(); i++) {
                Optional<List<Long>> min = queries.stream().min());
                data.add(min);
        }
        return data;
    }

}
public class Solu2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int queriesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Long> result = Result.numberOfWays(queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
