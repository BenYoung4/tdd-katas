public class FizzBuzz {

    public String input (int value){
        String output;
        if (value != 0 && value != 1) {
            output = checkValues(value);
            inputValues(2, 100);
            return output;
        } else if (value ==1) {
            return "1 is a multiple of every number";
        }
        return String.valueOf(value);
    }

    public Object inputValues(int min, int max){
        for (int i = min; i < max; i++) {
            String output = checkValues(i);
            System.out.println(output + ", ");
        }
        return null;
    }

    public String checkValues(int value) {
        if ();
    }
}
