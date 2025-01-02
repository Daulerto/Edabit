package VeryEasyTest;

import VeryEasy.howManySeconds;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class howManySecondsTest {
    @Test
    public void test1() {
        assertEquals(7200, howManySeconds.howManySecondsInHours(2));
    }

    @Test
    public void test2() {
        assertEquals(36000, howManySeconds.howManySecondsInHours(10));
    }

    @Test
    public void test3() {
        assertEquals(86400, howManySeconds.howManySecondsInHours(24));
    }

    @Test
    public void test4() {
        assertEquals(129600, howManySeconds.howManySecondsInHours(36));
    }
}
