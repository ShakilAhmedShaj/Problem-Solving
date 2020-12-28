import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P_412_FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        if (n < 1)
            return result;
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(Integer.toString(i));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(P_412_FizzBuzz.fizzBuzz(n));

        bufferedReader.close();
    }
}
