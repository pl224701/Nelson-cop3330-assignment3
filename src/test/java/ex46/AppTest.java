package ex46;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void notEqualToNull1()
    {
        App test = new App();
        assertNotNull(test);
    }
    @Test
    public void notEqualToNull2()
    {
        uniqueNames test = new uniqueNames();
        String str = "badger badger badger\n" +
                "badger mushroom\n" +
                "mushroom snake badger badger\n" +
                "badger";
        String[] words = str.split("\\s+");
        assertNotNull(test.unique(words));
    }
    @Test
    public void notEqualToNull3()
    {
        Counter test = new Counter();
        String str = "badger badger badger\n" +
                "badger mushroom\n" +
                "mushroom snake badger badger\n" +
                "badger";
        String[] words = str.split("\\s+");
        String[] unique_names = {"badger", "mushroom", "snake"};
        assertNotNull(test.counts(unique_names,words));
    }
    @Test
    public void notEqualToNull4()
    {
        reorder test = new reorder();
        String[] unique_names = {"badger", "mushroom", "snake"};
        Integer[] a = {7,3,1};
        assertNotNull(test.reordered(unique_names,a));
    }
}