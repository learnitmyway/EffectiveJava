package item41;

// This is supposed to show how overloading works. Don't do this!
final public class Car {
	
	private Integer numberOfDoors;
	private int numberOfSeats;

	public void design(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void design(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
}
