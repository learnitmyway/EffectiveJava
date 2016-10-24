package item5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void test() {
		// GIVEN
		final Counter counter = new Counter();

		// WHEN
		long sum = counter.calculateSum();

		// THEN
		assertThat(sum).isEqualTo(10);
	}

}
