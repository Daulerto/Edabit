package VeryEasyTest;

import VeryEasy.Challenge1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Challenge1Tests {

    @Test
    public void test1(){
        Assert.assertEquals(Challenge1.convert(1), 60);
        Assert.assertEquals(Challenge1.convert(4), 240);
        Assert.assertEquals(Challenge1.convert(60), 3600);
    }
}
