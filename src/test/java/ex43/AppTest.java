package ex43;

import org.junit.Test;

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
        Folder test = new Folder();
        assertNotNull(test.create_folder("awesomeco"));
    }
    @Test
    public void notEqualToNull3()
    {
        CSS test = new CSS();
        assertNotNull(test.CSS_files("awesomeco"));
    }
    @Test
    public void notEqualToNull4()
    {
        JS test = new JS();
        assertNotNull(test.javascript("awesomeco"));
    }
    @Test
    public void notEqualToNull5()
    {
        index test = new index();
        String str = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"something\">\n" +
                "    <title>$Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        assertNotNull(test.html("awesomeco","Max Power",str));
    }
}
