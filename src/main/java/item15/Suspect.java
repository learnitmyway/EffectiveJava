package item15;

final class Suspect {
	private final String eyeColor;
	private final String hairColor;
	private final int height;
	
	public Suspect(String eyeColor, String hairColor, int height) {
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.height = height;
	}

	String getEyeColor() {
		return eyeColor;
	}

	String getHairColor() {
		return hairColor;
	}

	int getHeight() {
		return height;
	}
	
	

}
