import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class PrimeFactorsTest {
    @Test
    public void shouldReturnNothing() {
        assertEquals(Collections.emptyList(), new PrimeFactors().generate(1));
    }
    @Test
    public void shouldReturnTwo() {
        assertIterableEquals(Arrays.asList(2), new PrimeFactors().generate(2));
    }
    @Test
    public void shouldReturnThree() {

    }
}
