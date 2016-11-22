package item38;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

public class BasicArithmeticTest {

	@Test
	public void test_setPositiveInt_throwsException_ifArgIsNegative() {
		// GIVEN
		final BasicArithmetic basicArithmetic = new BasicArithmetic();

		// WHEN and THEN
		assertThatThrownBy(() -> {
			basicArithmetic.setPositiveInt(-1);
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void test_setPositiveInt_throwsException_ifArgIsZero() {
		// GIVEN
		final BasicArithmetic basicArithmetic = new BasicArithmetic();

		// WHEN and THEN
		assertThatThrownBy(() -> {
			basicArithmetic.setPositiveInt(0);
		}).isInstanceOf(IllegalArgumentException.class);
	}
}
