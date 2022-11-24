import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {
    static DecimalFormat df = new DecimalFormat("#.#####");

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i)>0){
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            }else {
                zero++;
            }
        }
        System.out.println(df.format((double) positive/arr.size()));
        System.out.println(df.format((double) negative/arr.size()));
        System.out.println(df.format((double) zero/arr.size()));
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream
                .of(bufferedReader
                        .readLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }

}
