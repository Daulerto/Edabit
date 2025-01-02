package VeryEasyTest;

import VeryEasy.findPerimeter;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class findPerimeterTest {
    @Test
    public void test1() {
        assertEquals(26, findPerimeter.findPerimeterInForm(6, 7));
    }

    @Test
    public void test2() {
        assertEquals(60, findPerimeter.findPerimeterInForm(20, 10));
    }

    @Test
    public void test3() {
        assertEquals(22, findPerimeter.findPerimeterInForm(2, 9));
    }
}
