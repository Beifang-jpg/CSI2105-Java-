import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A1Test {
    @Test
    public void biggerXTest(){
        assertEquals(A1.BiggerX(1), 2);
    }
    @Test
    public void upperYTest(){
        assertEquals(A1.upperY(1),2);

    }
    @Test
    public void lowerYTest(){
        assertEquals(A1.lowerY(1),0);
    }
    @Test
    public void smallerXTest(){
        assertEquals(A1.SmallerX(1),0);
    }

}
