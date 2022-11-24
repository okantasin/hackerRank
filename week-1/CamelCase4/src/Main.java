import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static String camelCase4(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        if (words.length > 0) {
            sb.append(words[0].toLowerCase());
        }
        for (int i = 1; i < words.length; i++) {
            sb.append(words[i].substring(0, 1).toUpperCase());
            sb.append(words[i].substring(1).toLowerCase());
        }
        return sb.toString();
    }



    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        camelCase4(s);
        bufferedReader.close();
    }
}