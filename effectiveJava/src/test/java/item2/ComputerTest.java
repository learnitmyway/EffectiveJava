package item2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ComputerTest {
	
	@Test
	public void test_computerIsMyMacbookAir_true() {
		// GIVEN
		final Computer computer = new Computer
				.Builder(4, 1.6, 11, 128)
				.fabricCase(true)
				.build();

		// WHEN
		final boolean isMyMacbookAir = computer.isMyMacbookAir();

		// THEN
		assertThat(isMyMacbookAir).isTrue();
		
	}

	@Test
	public void test_computerIsMyMacbookAir_false() {
		// GIVEN
		final Computer computer = new Computer
				.Builder(4, 1.6, 11, 256)
				.fabricCase(true)
				.build();

		// WHEN
		final boolean isMyMacbookAir = computer.isMyMacbookAir();

		// THEN
		assertThat(isMyMacbookAir).isFalse();
		
	}
}
