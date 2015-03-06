import be.ac.ua.ansymo.adbc.annotations.*;

/**
 * SOEN 331 Assignment 2
 * 
 * @author Michael Bilinsky 26992358
 * @author David Bastien 26948553
 */

@invariant({"$this.isTwoOrNoLeaf()"})
public class FullBinaryTree extends BinTree{

	public FullBinaryTree(long id) {
		super(id);
	}

}
