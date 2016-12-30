package items_58_59_60;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import items_58_59_60.MessageParser;

public class MessageParserTest {

	@Test
	public void test_parseMessageFromFile_catchesFileNotFoundException() {
		// given
		final MessageParser messageParser = new MessageParser();

		// when
		final String message = messageParser.parseMessageFromFile();
		
		// then
		assertThat(message).isEqualTo("fileThatDoesNotExist (The system cannot find the file specified)");
	}

}