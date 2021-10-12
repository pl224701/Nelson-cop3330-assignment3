package ex41;

import org.junit.Test;

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
        Alphabetize test = new Alphabetize();
        String str = "Ling, Mai\n" +
                "Johnson, Jim\n" +
                "Zarnecki, Sabrina\n" +
                "Jones, Chris\n" +
                "Jones, Aaron\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong";
        ArrayList<String> array = new ArrayList<String>(Arrays.asList(str.split("\n")));
        assertNotNull(test.Alphabetizes(array));
    }
    @Test
    public void notEqualToNull3()
    {
        print test = new print();
        String str = "Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina";
        String[] array = str.split("\n");
        assertNotNull(test.prints(array));
    }
}
