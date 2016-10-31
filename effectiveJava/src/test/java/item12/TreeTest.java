package item12;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void test_height() {

		// GIVEN
		final int smallHeight = 5;
		final Tree smallTree = new Tree(smallHeight, 9);

		final int largeHeight = 30;
		final Tree largeTree = new Tree(largeHeight, 8);

		// WHEN
		final int comparison = smallTree.compareTo(largeTree);

		// THEN
		assertThat(comparison).isEqualTo(smallHeight - largeHeight);
	}

	@Test
	public void test_diameter() {

		// GIVEN
		final int smallDiameter = 2;
		final int height = 8;
		final Tree smallTree = new Tree(height, smallDiameter);

		final int largeDiameter = 3;
		final Tree largeTree = new Tree(height, largeDiameter);

		// WHEN
		final int comparison = smallTree.compareTo(largeTree);

		// THEN
		assertThat(comparison).isEqualTo(smallDiameter - largeDiameter);
	}

	@Test
	public void test_treesAreEqual() {

		// GIVEN
		final int diameter = 2;
		final int height = 8;
		final Tree tree = new Tree(height, diameter);

		// WHEN
		final int comparison = tree.compareTo(tree);

		// THEN
		assertThat(comparison).isEqualTo(0);
	}
}
