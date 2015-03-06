import be.ac.ua.ansymo.adbc.annotations.invariant;

/**
 * SOEN 331 Assignment 2
 * 
 * @author Michael Bilinsky 26992358
 * @author David Bastien 26948553
 */

@invariant({"$this.isBalanced()"})
public class BalancedBinTree extends BinTree{

	public BalancedBinTree(long id) {
		super(id);
	}

}
