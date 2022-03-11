package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void putGetTest(){
        //Given
        Map<Integer, String> s = new TreeMap<>();

        //Then
        s.put(0,"zero");
        s.put(-1,"negative");


        //When
        Assert.assertEquals("zero",s.get(0));
        Assert.assertEquals("negative",s.get(-1));
    }
    @Test
    public void replaceAndKeySeTTest(){
        //Given
        Map<Integer, String> s = new TreeMap<>();
        s.put(0,"zero");
        s.put(1,"one");

        //Then
        s.replace(1,"two");

        //When
        Assert.assertEquals(new Integer[] {0,1}, s.keySet().toArray());
        Assert.assertFalse(s.get(1).equals("one"));
        Assert.assertTrue(s.size()==2);
    }
}
