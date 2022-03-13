package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest{
    public List<Integer> s;
    public Iterator it;
    @Before
    public void setUP(){
        s = new ArrayList<>();
        s.add(1);
        s.add(2);
        it=s.iterator();
    }
    @Test
    public void hasNextAndNextTest(){
        //When
        boolean actualBeforeRemovingListObject = it.hasNext();
        Integer firstObject = (Integer) it.next(), expected= 1;
        it.next();
        boolean actualAfter = it.hasNext();
        //Then
        Assert.assertTrue(actualBeforeRemovingListObject);
        Assert.assertFalse(actualAfter);
        Assert.assertEquals(expected,firstObject);
    }
    @Test
    public void removeTest(){
        //When
        boolean actualBefore = s.contains(1);
        it.next();
        it.remove();
        //Then
        Assert.assertTrue(actualBefore);
        Assert.assertFalse(s.contains(1));
    }
}
