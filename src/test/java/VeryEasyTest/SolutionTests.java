package VeryEasyTest;

import VeryEasy.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTests {

    @Test
    public void test1(){
        Assert.assertEquals(Solution.getVoteCount(26,12), 14);
        Assert.assertEquals(Solution.getVoteCount(13,20), -7);
        Assert.assertEquals(Solution.getVoteCount(0,12), -12);
    }
}
