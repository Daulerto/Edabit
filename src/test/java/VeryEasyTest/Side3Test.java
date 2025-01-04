package VeryEasyTest;

import VeryEasy.Side3;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Side3Test {
    @Test
    public void test1() {
        assertThat(Side3.nextEdge(5, 4), is(8));
    }

    @Test
    public void test2() {
        assertThat(Side3.nextEdge(8, 3), is(10));
    }

    @Test
    public void test3() {
        assertThat(Side3.nextEdge(7, 9), is(15));
    }

    @Test
    public void test4() {
        assertThat(Side3.nextEdge(10, 4), is(13));
    }

    @Test
    public void test5() {
        assertThat(Side3.nextEdge(7, 2), is(8));
    }
}
