import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List <Integer> generate(int userInput) {
        int n = userInput;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}