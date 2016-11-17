package item41;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		// GIVEN
		final Car car = new Car();

		final Integer numberOfDoors_expected = 5;
		final int numberOfSeats_expected = 4;

		car.design(numberOfDoors_expected);
		car.design(numberOfSeats_expected);

		// WHEN
		final Integer numberOfDoors = car.getNumberOfDoors();
		final int numberOfSeats = car.getNumberOfSeats();

		// THEN
		SoftAssertions softly = new SoftAssertions();

		softly.assertThat(numberOfDoors).isEqualTo(numberOfDoors_expected);
		softly.assertThat(numberOfSeats).isEqualTo(numberOfSeats_expected);

		softly.assertAll();
	}

}
