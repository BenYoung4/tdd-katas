import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
    @Test
    void shouldGreetMe() {
        assertEquals("Hello Bob", new Greeter().greet("Bob"));
    }

    @Test
    void ShouldTrim() {
        assertEquals("Hello Bob", new Greeter().greet(" Bob "));
    }

    @Test
    void ShouldCapitalizeFirstLetter() {
        assertEquals("Hello Bob", new Greeter().greet("Bob"));
    }
}