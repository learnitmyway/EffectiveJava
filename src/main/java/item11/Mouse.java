package item11;

public class Mouse {
	private String name;

	public Mouse(String name) {
		this.name = name;
	}

	public static Mouse newInstance(Mouse mouse) {
		return mouse;
	}

	public String getName() {
		return name;
	}

}
