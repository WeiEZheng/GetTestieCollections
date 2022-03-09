package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void TestStackPop1(){
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        //When
        int actual = stack.pop();

        //Then
        assertEquals(2,actual);
        assertEquals(1,stack.size());
    }

    @Test
    public void TestStackPush1(){
        //Given
        Stack<Integer> stack = new Stack<>();

        //When
        stack.push(2);

        //Then
        assertEquals(1,stack.size());
    }

    @Test

    public void TestStackPeek1(){
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        //When
        int actual = stack.peek();

        //Then
        assertEquals(2,actual);
        assertEquals(2,stack.size());
    }

    @Test
    public void TestStackIsEmpty1(){
        //Given
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        //When
        boolean empty= stack.isEmpty();

        //Then
        assertFalse(empty);
    }
}
