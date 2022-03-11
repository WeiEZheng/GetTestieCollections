package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void addSetGetTest(){
        //Given
        Vector<String> s = new Vector<>();

        //When
        s.add("0");
        s.add(1,"1");
        s.add(1,"2");
        s.set(2,"3");

        //Then
        Assert.assertEquals("0",s.get(0));
        Assert.assertEquals("2",s.get(1));
        Assert.assertEquals(3,s.size());
        Assert.assertEquals("3",s.get(2));
        Assert.assertEquals(1,s.indexOf("2"));
    }

}
