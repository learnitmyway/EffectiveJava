package item11;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MouseTest {

	@Test
	public void test_newInstance_isCopy() {

		final String name = "Barry";
		// GIVEN
		final Mouse mouse = new Mouse(name);

		// WHEN
		final Mouse mouseCopy = Mouse.newInstance(mouse);

		// THEN
		assertThat(mouseCopy.getName()).isEqualTo(name);
	}

}
