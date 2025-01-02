package VeryEasyTest;

import VeryEasy.SumOfTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoNumbersTests {

    @Test
    public void test1(){
        Assert.assertEquals(SumOfTwoNumbers.sum(3,2), 5);
        Assert.assertEquals(SumOfTwoNumbers.sum(-18,2), -16);
        Assert.assertEquals(SumOfTwoNumbers.sum(7,-2), 5);
    }
}
