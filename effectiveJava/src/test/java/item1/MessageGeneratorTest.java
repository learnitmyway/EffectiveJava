package item1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageGeneratorTest {

	@Test
	public void test_getMessage() {
		// GIVEN
		final String expectedMessage = "wooooo using a static factory!!";

		// WHEN
		final MessageGenerator messageGenerator = MessageGenerator.newInstance();
		messageGenerator.setMessage(expectedMessage);

		// THEN
		final String actualMessage = messageGenerator.getMessage(); 
		assertTrue(actualMessage.equals(expectedMessage));
	}

}
