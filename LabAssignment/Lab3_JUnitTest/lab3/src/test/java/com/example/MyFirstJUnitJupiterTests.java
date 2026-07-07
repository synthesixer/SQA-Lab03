import static org.junit.jupiter.api.Assertions.assertEquals;
import sqa.lab.ShiftCipher;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

	private final ShiftCipher shiftCipher = new ShiftCipher();

	@Test
	void TC01() {
		assertEquals("ZVMADHYL",shiftCipher.shift("SOFTWARE", 3));
	};

	@Test
	void TC02() {
		assertEquals("zvmadhyl", shiftCipher.shift("software", 3));
	};

	@Test
	void TC03() {
		assertEquals("GHHSZRNHQ", shiftCipher.shift("DEEPWOKEN", 3));
	};

	@Test
	void TC04() {
		assertEquals("0894344652JJ", shiftCipher.shift("0894344652GG", 3));
	};

	@Test
	void TC05() {
		assertEquals("ZVMADHYL", shiftCipher.shift("SOFTWARE", 7));
	};
	
}