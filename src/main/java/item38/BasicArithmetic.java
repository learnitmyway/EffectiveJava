package item38;

final public class BasicArithmetic {

	/**
	 * @param i positve int
	 * @throws IllegalArgumentException if i < 1
	 */
	public void setPositiveInt(int i) {
		if (i < 1) {
			throw new IllegalArgumentException();
		}
	}
	
}
