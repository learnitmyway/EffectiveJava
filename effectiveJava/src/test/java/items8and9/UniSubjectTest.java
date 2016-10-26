package items8and9;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class UniSubjectTest {

	@Test
	// x.equals(y) and y.equals(x) is true
	public void test_equals_isSymmetric() {
		// GIVEN
		final UniSubject x = new UniSubject("Math", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2016);

		test_areEqual(x, y);
	}
	
	@Test
	// if x.equals(z) and y.equals(z) is true then x.equals(y) is true
	public void test_equals_isTransitive() {
		// GIVEN
		final UniSubject x = new UniSubject("Math", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2016);
		final UniSubject z = new UniSubject("Math", "Joe", 2016);

		// WHEN
		boolean xEqualsZ = x.equals(z);
		boolean yEqualsZ = y.equals(z);
		boolean xEqualsY = x.equals(y);

		// THEN
		final SoftAssertions softly = new SoftAssertions();
		softly.assertThat(xEqualsZ).isTrue();
		softly.assertThat(yEqualsZ).isTrue();
		softly.assertThat(xEqualsY).isTrue();
		
		softly.assertAll();
	}

	@Test
	// Objects must remain equal unless they are modified
	public void test_equals_isConsistent() {
		// GIVEN
		UniSubject x = new UniSubject("Math", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2016);
		test_areEqual(x, y);
		
		x = new UniSubject("Math", "Bob", 2016);

		// WHEN
		boolean xEqualsY = x.equals(y);
		
		// THEN
		assertThat(xEqualsY).isFalse();
		
	}

	@Test
	public void test_equals_isFalse_content() {
		// GIVEN
		final UniSubject x = new UniSubject("English", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2016);

		// WHEN
		boolean xEqualsY = x.equals(y);

		// THEN
		assertThat(xEqualsY).isFalse();
	}

	@Test
	public void test_equals_isFalse_prof() {
		// GIVEN
		final UniSubject x = new UniSubject("Math", "Bob", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2016);

		// WHEN
		boolean xEqualsY = x.equals(y);

		// THEN
		assertThat(xEqualsY).isFalse();
	}

	@Test
	public void test_equals_isFalse_year() {
		// GIVEN
		final UniSubject x = new UniSubject("Math", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2015);

		// WHEN
		boolean xEqualsY = x.equals(y);

		// THEN
		assertThat(xEqualsY).isFalse();
	}

	@Test
	public void test_hashCode_isUnique_content() {
		// GIVEN
		final UniSubject x = new UniSubject("English", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2016);

		// WHEN
		int xHashCode = x.hashCode();
		int yHashCode = y.hashCode();

		// THEN
		assertThat(xHashCode == yHashCode).isFalse();
	}

	@Test
	public void test_hashCode_isUnique_prof() {
		// GIVEN
		final UniSubject x = new UniSubject("Math", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Bob", 2016);

		// WHEN
		int xHashCode = x.hashCode();
		int yHashCode = y.hashCode();

		// THEN
		assertThat(xHashCode == yHashCode).isFalse();
	}

	@Test
	public void test_hashCode_isUnique_year() {
		// GIVEN
		final UniSubject x = new UniSubject("Math", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2015);

		// WHEN
		int xHashCode = x.hashCode();
		int yHashCode = y.hashCode();

		// THEN
		assertThat(xHashCode == yHashCode).isFalse();
	}

	@Test
	public void test_hashCode_isEqual() {
		// GIVEN
		final UniSubject x = new UniSubject("Math", "Joe", 2016);
		final UniSubject y = new UniSubject("Math", "Joe", 2016);

		// WHEN
		int xHashCode = x.hashCode();
		int yHashCode = y.hashCode();

		// THEN
		assertThat(xHashCode == yHashCode).isTrue();
	}

	private void test_areEqual(final UniSubject x, final UniSubject y) {

		// WHEN
		boolean xEqualsY = x.equals(y);
		boolean yEqualsX = y.equals(x);

		// THEN
		final SoftAssertions softly = new SoftAssertions();
		softly.assertThat(xEqualsY).isTrue();
		softly.assertThat(yEqualsX).isTrue();
		
		softly.assertAll();
	}

}
