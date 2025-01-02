package VeryEasyTest;

import VeryEasy.Program;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgramTests {
    @Test
    public void test1(){
        Assert.assertFalse(Program.isSameNum(7, 9));
        Assert.assertFalse(Program.isSameNum(-2, 2));
        Assert.assertTrue(Program.isSameNum(0, 0));
        Assert.assertTrue(Program.isSameNum(8, 8));
    }
}
