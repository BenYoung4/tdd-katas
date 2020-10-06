package young.StringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    public void shouldReturnZeroWhenNothing() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnSingleNumber() {
        assertEquals(100, StringCalculator.add("100"));
    }

    @Test
    public void shouldReturnSumOfCommas (){
        assertEquals(10, StringCalculator.add("7,3"));
    }

    @Test
    public void shouldReturnSumOfNewLines () {
        assertEquals(15, StringCalculator.add("7\n8"));
    }

    @Test
    public void shouldReturnSumOfCommasNewLines () {
        assertEquals(27, StringCalculator.add("6\n9,10\n2"));
    }

}