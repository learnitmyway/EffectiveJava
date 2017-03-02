package item4;

import org.junit.Test;

public class UtilTest {

	@Test(expected=AssertionError.class)
	public void test_classIsNonInstantiable() {
		
		// WHEN
		new Util();
	
	}

}
