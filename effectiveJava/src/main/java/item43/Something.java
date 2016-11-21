package item43;

import java.util.Collections;
import java.util.List;

final class Something {
	private List<String> listOfSomething;
	
	public Something(List<String> listOfSomething) {
		this.listOfSomething = listOfSomething;
	}

	public List<String> getListOfSomething() {
		if (null == listOfSomething) {
			return Collections.emptyList();
		}
		return listOfSomething;
	}
	
}
