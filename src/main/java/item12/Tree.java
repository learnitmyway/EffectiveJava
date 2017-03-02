package item12;

public class Tree implements Comparable<Tree> {
	private int height;
	private int diameter;

	public Tree(int height, int diameter) {
		this.height = height;
		this.diameter = diameter;
	}

	@Override
	public int compareTo(Tree tree) {
		final int heightDiff = height - tree.height;
		if (heightDiff != 0) {
			return heightDiff;
		}
		
		final int diameterDiff = diameter - tree.diameter;
		if (diameterDiff != 0) {
			return diameterDiff;
		}
		
		// trees are equal
		return 0;
	}

}
