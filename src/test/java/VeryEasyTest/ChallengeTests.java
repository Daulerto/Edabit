package VeryEasyTest;

import VeryEasy.Challange;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ChallengeTests {
    @Test
    public void test1() {
        assertEquals(true, Challange.isEqual(2, 2));
    }

    @Test
    public void test2() {
        assertEquals(true, Challange.isEqual(88, 88));
    }

    @Test
    public void test3() {
        assertEquals(false, Challange.isEqual(36, 35));
    }

    @Test
    public void test4() {
        assertEquals(true, Challange.isEqual(1, 1));
    }

    @Test
    public void test5() {
        assertEquals(false, Challange.isEqual(5, 6));
    }
}
