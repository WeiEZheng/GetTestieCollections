package rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    List<Person> list;
    Person persona = new Person("a",0);
    Person personb = new Person("b",0);
    Person personz = new Person("z",0);
    @Before
    public void setUp(){
        list=new ArrayList<>();
        list.add(persona);
        list.add(personz);
        list.add(personb);
    }
    @Test
    public void Test(){
        //When (implemented comparable to person)
        Collections.sort(list);
        List<Person> expected = new ArrayList<>();
        expected.add(persona);
        expected.add(personb);
        expected.add(personz);
        //Then
        Assert.assertEquals(expected,list);
    }
}
