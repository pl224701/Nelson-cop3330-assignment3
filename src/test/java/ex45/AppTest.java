package ex45;

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
        replacement test = new replacement();
        String a = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        ArrayList<String> tester = new ArrayList<String>(Arrays.asList(a.split(" ")));
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("exercise_file.txt".getBytes());
        System.setIn(in);
        assertNotNull(test.replacing(tester));
    }
    @Test
    public void notEqualToNull3()
    {
        print test = new print();
        String a = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        String[] b = a.split(" ");
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("exercise_file.txt".getBytes());
        System.setIn(in);
        assertNotNull(test.prints(b));
    }
}