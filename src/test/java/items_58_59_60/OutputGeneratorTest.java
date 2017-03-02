package items_58_59_60;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

import items_58_59_60.OutputGenerator;

public class OutputGeneratorTest {

	@Test
	public void test_illegalStateExceptionIsThrown() {
		// given
		final OutputGenerator outputGenerator = new OutputGenerator();
		final String text = null;

		// when and then
		assertThatThrownBy(() -> {
			outputGenerator.generateOutput(text);
		}).isInstanceOf(IllegalStateException.class);
	}

}
