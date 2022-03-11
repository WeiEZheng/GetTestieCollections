package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    @Test
    public void addPeekTest() {
        //Given
        Queue<String> s = new PriorityQueue<>();

        //When
        s.add("first");
        String x = s.peek();
        int beforePoll = s.size();
        String y = s.poll();
        int afterPoll = s.size();

        //Then
        Assert.assertEquals("first",x);
        Assert.assertEquals(1,beforePoll);
        Assert.assertEquals(0,afterPoll);
    }
    @Test
    public void offerTest(){
        //Given
        Queue<String> s = new PriorityQueue<>();
        s.add("first");
        //When
        s.offer("second");
        s.poll();
        //Then
        Assert.assertEquals("second",s.peek());
    }

    @Test
    public void removeContainsTest() {
        //Given
        Queue<String> s = new PriorityQueue<>();
        s.add("first");
        s.offer("second");
        //When
        s.remove("second");
        //Then
        Assert.assertFalse(s.contains("second"));
    }
}
