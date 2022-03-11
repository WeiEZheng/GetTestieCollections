package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    public void putTest(){
        //Given
        HashMap<String, String> s = new HashMap<>();
        s.put("1","Ark");

        //When
        String s1="Ark";

        //Then
        Assert.assertEquals(s1, s.get("1"));
    }
    @Test
    public void removeTest(){
        //Given
        HashMap<String, String> s = new HashMap<>();
        s.put("1","Ark");
        s.put("2","Ark1");

        //When
        s.remove("1");

        //Then
        Assert.assertFalse(s.containsKey("1"));
        Assert.assertTrue(s.containsKey("2"));
        Assert.assertEquals(1,s.size());
    }
}
