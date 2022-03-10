package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    @Test
    public void addTest(){
        //Given
        HashSet <Integer> s = new HashSet<>();
        s.add(1);

        //When
        s.add(1); //Hashset contains no duplicates

        //Then
        Assert.assertEquals(1,s.size());
    }
    @Test
    public void containsTest(){
        //Given
        HashSet <Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);

        //When
        boolean containsActual = s.contains(1);
        boolean containsActual1 = s.contains(0);

        //Then
        Assert.assertTrue(containsActual);
        Assert.assertFalse(containsActual1);
        Assert.assertFalse(s.isEmpty());
    }

}
