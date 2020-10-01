import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FizzBuzzTest {

    @Test
    public void ShouldReturnNumberOne() {
        assertEquals("1", new FizzBuzz().number(1));
    }

    @Test
    public void ShouldReturnNumberTwo (){
        assertEquals("2", new FizzBuzz().number(2));
    }

    @Test
    public void ShouldReturnFizz() {
        assertEquals("Fizz",new FizzBuzz().number(3));
    }

    @Test
    public void ShouldReturnFour() {
        assertEquals("4",new FizzBuzz().number(4));
    }

    @Test
    public void ShouldReturnBuzz() {
        assertEquals("Buzz",new FizzBuzz().number(5));
    }

    @Test
    public void ShouldReturnFoo() {
        assertEquals("Foo",new FizzBuzz().number(7));
    }

    @Test
    public void ShouldReturnBar() {
        assertEquals("Bar",new FizzBuzz().number(11));
    }

    @Test
    public void ShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz",new FizzBuzz().number(15));
    }

    @Test
    public void ShouldReturnFooBar() {
        assertEquals("FooBar",new FizzBuzz().number(77));
    }

}
