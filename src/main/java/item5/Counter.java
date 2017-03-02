package item5;

public class Counter {

	public long calculateSum() {
		
		// BAD
//		Long sum = 0L;
//		for (long i = 0; i < 10; i++) {
//			sum += 1;
//		}
		
		// GOOD
		long sum = 0L;
		for (long i = 0; i < 10; i++) {
			sum += 1;
		}

		return sum;
	}

}
