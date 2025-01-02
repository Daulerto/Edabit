package VeryEasyTest;

import VeryEasy.Circuit;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CircuitTests {
    @Test
    public void test01() {
        assertEquals(Circuit.power(230, 10), 2300);
    }

    @Test
    public void test02() {
        assertEquals(Circuit.power(110, 3), 330);
    }

    @Test
    public void test03() {
        assertEquals(Circuit.power(480, 20), 9600);
    }
}
