package stringCahin.stringCahin;
public class Integration_B_CTest {
	@Test
	public void Integration_BtoC_withDstub() {
		DStub dStub = new DStub();
		C realC = new C(dStub);
		B realB = new B(realC);
		
		String result = realB.process("H");
		assertEquals("HELX",result)
	}
}
