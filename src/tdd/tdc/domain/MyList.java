package tdd.tdc.domain;

import java.util.Arrays;
import java.util.List;

public class MyList {

	public List<Item> getMyList() {
		Item [] aTest = new Item[] { new Item("Batata", 4.0f),new Item("Laranja", 3.0f), new Item("Chuchu", 1.5f), new Item("Mamão", 3.5f), new Item("Couve", 3.2f)};
		List<Item> listTest = Arrays.asList(aTest);
		return listTest;
	}
}
