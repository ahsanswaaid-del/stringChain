import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Integration_D_ETest {
	@Test
	public void Integration_DtoE_withDstub() {
		E realE = new E();
		D reald = new D(realE);
		
		String result = realB.process("H");
		assertEquals("HELX",result)
	}
}
