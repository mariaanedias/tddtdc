/**
 * Simple JUnit Test
 */

package tdd.tdc.test.unit;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.beans.HasPropertyWithValue;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.hamcrest.core.Is;

import org.junit.Assert;
import org.junit.Test;
import tdd.tdc.domain.Item;
import tdd.tdc.domain.MyList;

public class ListTest {

	@Test
	public void testList() throws Exception {
		Item[] aTest = new Item[] { new Item("Batata", 4.0f), 
				new Item("Laranja", 3.0f), new Item("Chuchu", 1.5f),
				new Item("Mamão", 3.5f), new Item("Couve", 3.2f) };
		List<Item> listTest = Arrays.asList(aTest);
		
		MyList l = new MyList();
		List<Item> list1 = l.getMyList();

		assertTrue(list1.size() == 5);
		Assert.assertThat(list1,
				IsIterableContainingInAnyOrder.containsInAnyOrder(
						HasPropertyWithValue.hasProperty("name", Is.is("Couve")),
						HasPropertyWithValue.hasProperty("name", Is.is("Laranja")),
						HasPropertyWithValue.hasProperty("name", Is.is("Batata")),
						HasPropertyWithValue.hasProperty("name", Is.is("Chuchu")),
						HasPropertyWithValue.hasProperty("name", Is.is("Mamão"))));

		Assert.assertThat(list1,
				contains(
						HasPropertyWithValue.hasProperty("price", Is.is(4.0f)),
						HasPropertyWithValue.hasProperty("price", Is.is(3.0f)),
						HasPropertyWithValue.hasProperty("price", Is.is(1.5f)),
						HasPropertyWithValue.hasProperty("price", Is.is(3.5f)),
						HasPropertyWithValue.hasProperty("price", Is.is(3.2f))));
		
		ListTestMatcher matcherL = new ListTestMatcher(list1);
		Assert.assertThat(listTest, matcherL);
	}
}
