package items_58_59_60;

public class OutputGenerator {

	/**
	 * Prints the text to the display. If the text is null an
	 * IllegalStateException is thrown.
	 * 
	 * @param text
	 *            String that is printed.
	 * 
	 */
	public void generateOutput(String text) {
		if (null == text) {
			throw new IllegalStateException();
		} else {
			System.out.println(text);
		}

	}

}
