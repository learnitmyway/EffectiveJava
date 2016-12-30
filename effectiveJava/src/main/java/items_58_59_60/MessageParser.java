package items_58_59_60;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

final class MessageParser {

	/**
	 * Parses a message from a file. If the file does not exist the exception is
	 * caught and the exception message is used.
	 * 
	 * @return parsed message from file or exception message as a String
	 */
	String parseMessageFromFile() {
		String message = "";
		// try with resources
		try (final Scanner sc = new Scanner(new File("fileThatDoesNotExist"))) {
			// parsing logic
		} catch (FileNotFoundException e) {
			message = e.getMessage();
		}
		return message;
	}
	
	

}
