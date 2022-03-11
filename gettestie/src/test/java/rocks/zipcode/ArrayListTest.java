package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void addTest(){
        //Given
        ArrayList <Integer> s = new ArrayList<>();

        //When
        s.add(1);
        s.add(2);
        Integer expected = 1;

        //Then
        Assert.assertEquals(2,s.size());
    }
    @Test
    public void getTest(){
        //Given
        ArrayList <Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);

        //When
        Integer expected = 1;

        //Then
        Assert.assertEquals(expected,s.get(0));
    }
    @Test
    public void removeTest(){
        //Given
        ArrayList <Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);

        //When
        s.remove(0);

        //Then
        Assert.assertFalse(s.contains(1));
        Assert.assertEquals(1,s.size());
    }
    @Test
    public void removeObjTest(){
        //Given
        ArrayList <String> s = new ArrayList<>();
        s.add("1");
        s.add("2");

        //When
        s.remove("2");

        //Then
        Assert.assertFalse(s.contains("2"));
        Assert.assertEquals(1,s.size());
    }

}
