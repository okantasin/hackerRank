import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {


    public static List<Integer> breakingRecords(List<Integer> scores) {

        int max= scores.get(0);
        int min=scores.get(0);
        int maxCount=0;
        int minCount=0;

        for (int i = 0; i < scores.size(); i++) {

            if(scores.get(i)>max){
                max=scores.get(i);
                maxCount++;
            }
            if(scores.get(i)<min){
                min=scores.get(i);
                minCount++;
            }
        }
        List<Integer> result = new ArrayList<>();

        result.add(maxCount);
        result.add(minCount);
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );

        bufferedReader.close();
        //  bufferedWriter.close();
    }
}