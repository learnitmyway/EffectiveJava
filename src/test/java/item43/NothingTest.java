package item43;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NothingTest {

	@Test
	public void test_listIsEmpty() {

		// GIVEN
		final List<String> listOfSomethingExpected = new ArrayList<>();
		final Something something = new Something(listOfSomethingExpected);

		// WHEN
		final List<String> listOfSomething = something.getListOfSomething(); 

		// THEN
		assertThat(listOfSomething).isEmpty();
	}

	@Test
	public void test_listIsNotEmpty() {

		// GIVEN
		final List<String> listOfSomethingExpected = new ArrayList<>();
		listOfSomethingExpected.add("somethingExpected");
		final Something something = new Something(listOfSomethingExpected);

		// WHEN
		final List<String> listOfSomething = something.getListOfSomething(); 

		// THEN
		assertThat(listOfSomething).isNotEmpty();
	}
}
