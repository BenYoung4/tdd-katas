import org.omg.CORBA.ARG_IN;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FizzBuzz {
    public String number (int FizzyBuzzy) {

        while (FizzyBuzzy < 16){
            return "Small";
        }
        if(FizzyBuzzy % 15 == 0){
            return "FizzBuzz";
        }
        if(FizzyBuzzy % 77 == 0){
            return "FooBar";
        }
        if(FizzyBuzzy % 3 == 0){
            return "Fizz";
        }
        if(FizzyBuzzy % 5 == 0){
            return "Buzz";
        }
        if (FizzyBuzzy % 7 == 0){
            return "Foo";
        }
        if (FizzyBuzzy % 11 == 0){
            return "Bar";
        }
        return String.valueOf(FizzyBuzzy);
    }
}
