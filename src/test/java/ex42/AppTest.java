package ex42;

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
        Parser test = new Parser();
        String str = "Ling,Mai,55900\n" +
                "Johnson,Jim,56500\n" +
                "Jones,Aaron,46000\n" +
                "Jones,Chris,34500\n" +
                "Swift,Geoffrey,14200\n" +
                "Xiong,Fong,65000\n" +
                "Zarnecki,Sabrina,51500";
        ArrayList<String> array = new ArrayList<String>(Arrays.asList(str.split("\n")));
        assertNotNull(test.Parse(array));
    }
    @Test
    public void notEqualToNull3()
    {
        print test = new print();
        String str = "Ling,Mai,55900\n" +
                "Johnson,Jim,56500\n" +
                "Jones,Aaron,46000\n" +
                "Jones,Chris,34500\n" +
                "Swift,Geoffrey,14200\n" +
                "Xiong,Fong,65000\n" +
                "Zarnecki,Sabrina,51500";
        String[] tester = str.split("\n");
        for(int i =0;i<tester.length;i++)
        {
            tester[i]=tester[i].replaceAll("[,]"," ");
        }
        assertNotNull(test.prints(tester));
    }
}
