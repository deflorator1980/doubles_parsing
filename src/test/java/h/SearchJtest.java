package h;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class SearchJtest {

    /**
     * to run in Idea uncomment line in SearchJ.java
     * @throws IOException
     */
    @Test
    public void testSearchJ() throws IOException {
        SearchJ searchJ = new SearchJ();
        System.out.println(searchJ.get_double());
        assertEquals(new Double(3.14), searchJ.get_double().get(0));
        assertEquals(new Double(1000000.123123), searchJ.get_double().get(1));
    }

}
