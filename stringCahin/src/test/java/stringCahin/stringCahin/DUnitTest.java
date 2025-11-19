package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DUnitTest {

    @Test
    public void testDWithStub() {

        EStub stub = new EStub();   // סטאב של E
        D d = new D(stub);          // מחלקה אמיתית D

        String result = d.process("");

        assertEquals("LX", result);
    }
}
