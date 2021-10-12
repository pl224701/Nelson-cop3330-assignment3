package ex44;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

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
        input test = new input();
        String str = "{\n" +
                "  \"products\" : [\n" +
                "    {\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Doodad\", \"price\": 5.00, \"quantity\": 10 }\n" +
                "  ]\n" +
                "}";
        Gson gson = new Gson();
        App.Products tester = gson.fromJson(str, App.Products.class);
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Thing".getBytes());
        System.setIn(in);
        assertEquals(1,test.inputs(tester));
    }
    @Test
    public void notEqualToNull3()
    {
        print test = new print();
        String str = "{\n" +
                "  \"products\" : [\n" +
                "    {\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Doodad\", \"price\": 5.00, \"quantity\": 10 }\n" +
                "  ]\n" +
                "}";
        Gson gson = new Gson();
        App.Products tester = gson.fromJson(str, App.Products.class);
        assertNotNull(test.prints(tester,1));
    }
}
