package VeryEasyTest;

import VeryEasy.Challenge2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Challenge2Tests {

    @Test
    public void test1(){
        Assert.assertEquals(Challenge2.addition(1),2);
        Assert.assertEquals(Challenge2.addition(-1),0);
        Assert.assertEquals(Challenge2.addition(-9),-8);
    }
}
