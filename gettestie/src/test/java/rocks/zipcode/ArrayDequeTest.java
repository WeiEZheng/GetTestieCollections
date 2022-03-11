package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    @Test
    public void addPushGetAndPopTest() {
        //Given
        Deque<String> s = new ArrayDeque<>();

        //When
        s.add("1");
        s.push("0");

        //Then
        Assert.assertEquals("0",s.getFirst());
        Assert.assertEquals("1",s.getLast());
        Assert.assertEquals("0",s.pop());
        Assert.assertEquals(1,s.size()); //after pop the first element is removed
        Assert.assertFalse(s.getFirst().equals("0"));
    }
    @Test
    public void offerTest() {
        //Given
        Deque<String> s = new ArrayDeque<>();
        //When
        s.offer("0");
        s.offer("1");
        //Then
        Assert.assertEquals("0",s.getFirst());
        Assert.assertEquals("1",s.getLast());
    }
}
