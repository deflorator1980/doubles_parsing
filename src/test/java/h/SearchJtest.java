package h;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class SearchJtest {

    @Test
    public void testSearchJ() throws IOException {
        SearchJ searchJ = new SearchJ();
        System.out.println(searchJ.get_double().get(1));
        assertEquals(new Double(3.14), searchJ.get_double().get(0));
        assertEquals(new Double(1000000.123123), searchJ.get_double().get(1));
    }

}
