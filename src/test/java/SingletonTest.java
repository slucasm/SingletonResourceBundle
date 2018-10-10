import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    Singleton s;
    @Before
    public void setUp(){
        s = Singleton.getInstance();
    }

    @After
    public void tearUp(){
        s = null;
    }

    @Test
    public void testFiles()
    {
        String l1es = s.getInstance().getString("es","L1");
        assertEquals("Hola",l1es);
        String l2es = s.getInstance().getString("es","L2");
        assertEquals("Adios",l2es);
        String l1en = s.getInstance().getString("en","L1");
        assertEquals("Hello",l1en);
        String l2en = s.getInstance().getString("en","L2");
        assertEquals("Bye",l2en);
        String l1cat = s.getInstance().getString("cat","L1");
        assertEquals("Hola",l1cat);
        String l2cat = s.getInstance().getString("cat","L2");
        assertEquals("Adeu",l2cat);
    }

}