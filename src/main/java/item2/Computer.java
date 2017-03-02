package item2;

public class Computer {

	private int memory;
	private double cpu;
	private double display;
	private int storage;

	private boolean leatherCase;
	private boolean fabricCase;
	
	public Computer() {
		
	}

	public static class Builder {

		// required
		private int memory;
		private double cpu;
		private double display;
		private int storage;

		// optional
		private boolean leatherCase;
		private boolean fabricCase;

		public Builder(int memory, double cpu, double display, int storage) {
			this.memory = memory;
			this.cpu = cpu;
			this.display = display;
			this.storage = storage;
		}

		public Builder leatherCase(boolean isLeatherCase) {
			leatherCase = isLeatherCase;
			return this;
		}

		public Builder fabricCase(boolean isFabricCase) {
			fabricCase = isFabricCase;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

	private Computer(Builder builder) {

		// required
		memory = builder.memory;
		cpu = builder.cpu;
		display = builder.display;
		storage = builder.storage;

		// optional
		leatherCase = builder.leatherCase;
		fabricCase = builder.fabricCase;
	}

	public boolean isMyMacbookAir() {
		if (4 == memory && 1.6 == cpu && 11 == display && 128 == storage && fabricCase) {
			return true;
		}

		return false;
	}

}
