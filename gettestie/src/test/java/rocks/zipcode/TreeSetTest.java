package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void addTest(){
        //Given
        Set<Integer> s = new TreeSet<>();
        //When
        s.add(1);
        s.add(2);
        //Then
        Assert.assertTrue(s.contains(2));
        Assert.assertFalse(s.contains(0));
    }
    @Test
    public void orderTest(){
        //Given
        Set<Integer> s = new TreeSet<>();
        //When
        s.add(1);
        s.add(2);
        Integer[] expected = {1,2};
        Integer[] actual = new Integer[2];
        s.toArray(actual);
        //Then
        Assert.assertArrayEquals(expected,actual);
    }
}
