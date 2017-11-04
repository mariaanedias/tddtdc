package tdd.tdc.test.unit;

import java.util.List;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import tdd.tdc.domain.Item;

public class ListTestMatcher extends TypeSafeMatcher<List<Item>> {

	private List<Item> itemList;

	public ListTestMatcher(List<Item> itemList) {
		this.setItemList(itemList);
	}

	public void describeTo(Description desc) {
		desc.appendText("Check list elements");
	}

	protected boolean matchesSafely(List<Item> lItem) {
		if (lItem.size() > 0) {
			for (int i = 0; i < lItem.size(); i++) {
				if (!(lItem.get(0).getName().equals(lItem.get(0).getName()))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}