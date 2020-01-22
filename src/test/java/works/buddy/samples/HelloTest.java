package works.buddy.samples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void testSayingHello() {
        assertEquals("Hello", new Hello().say());
    }
}