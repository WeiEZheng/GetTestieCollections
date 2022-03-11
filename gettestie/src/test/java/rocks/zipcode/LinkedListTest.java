package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void addTest(){
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        s.add(1,"0"); //does not replace old index 1

        //Then
        Assert.assertEquals(3,s.size());
        Assert.assertEquals("0",s.get(1));
    }
    @Test
    public void setTest(){
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        s.set(1,"0");

        //Then
        Assert.assertEquals(2,s.size());
        Assert.assertEquals("0",s.get(1));
    }
    @Test
    public void removeTest() {
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        s.remove("1");
        s.remove(0);

        //Then
        Assert.assertEquals(0,s.size());
    }
    @Test
    public void addFirstTest() {
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        s.addFirst("0");

        //Then
        Assert.assertEquals("0",s.get(0));
        Assert.assertEquals("0",s.getFirst());
    }
    @Test
    public void addLastTest() {
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        s.addLast("0");

        //Then
        Assert.assertEquals("0",s.get(2));
        Assert.assertEquals("0",s.getLast());
    }
    @Test
    public void removeFirstTest() {
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        s.removeFirst();

        //Then
        Assert.assertEquals("2",s.get(0));
        Assert.assertEquals(1,s.size());
    }
    @Test
    public void removeLastTest() {
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        s.removeLast();

        //Then
        Assert.assertEquals("1",s.get(0));
        Assert.assertEquals(1,s.size());
    }
    @Test
    public void peekTest() {
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        String p= s.peek();

        //Then
        Assert.assertEquals("1",p);
        Assert.assertEquals(2,s.size());
    }
    @Test
    public void pollTest() {
        //Given
        LinkedList<String> s = new LinkedList<>();
        s.add("1");
        s.add("2");

        //When
        String p= s.poll();

        //Then
        Assert.assertEquals("1",p);
        Assert.assertEquals(1,s.size());
    }
}
