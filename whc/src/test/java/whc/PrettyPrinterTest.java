package whc;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrettyPrinterTest {

    PrintStream outSys;
    ByteArrayOutputStream mock = new ByteArrayOutputStream();
    
    @Before
    public void setUp() {
        outSys = System.out;
        System.setOut(new PrintStream(mock));
        
    }
    
    @After
    public void tearDown() {
        System.setOut(outSys);
    }
    
    @Test
    public void nop() throws Exception {
        Pp.main("nopTest.wh");
        assertEquals("function t :\nread Ma\n\t%nop\n%write T", mock.toString());
    }

}
