package young.StringCalculator;

import java.lang.reflect.Array;

public class StringCalculator {
    public static int add(String Something) {
        int sumOfNums = 0;
        if (Something.isEmpty()) {
            return 0;
        } else if (Something.contains(",") || Something.contains("\n")) {
            String swapToComma = Something.replaceAll("\n", ",");
            String[] justNums = swapToComma.split(",");
            for (int i = 0; i < justNums.length; i++) {
                sumOfNums += Integer.parseInt(justNums[i]);
            }
            return Integer.parseInt((String.valueOf(sumOfNums)));
        } else {
            return stringToInt(Something);
        }
    }
    public static int stringToInt(String Something) {
        return Integer.parseInt(Something);
    }
}