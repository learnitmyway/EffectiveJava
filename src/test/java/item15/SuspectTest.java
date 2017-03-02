package item15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SuspectTest {

	@Test
	public void test() {
		// GIVEN
		final int expectedHeight = 210;

		// WHEN
		final Suspect suspect = new Suspect("brown", "black", expectedHeight);

		// THEN
		assertThat(suspect.getHeight()).isEqualTo(expectedHeight);
	}

}
