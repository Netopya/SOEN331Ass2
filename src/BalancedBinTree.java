import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant("$this.isBalanced()")
public class BalancedBinTree extends BinTree{

	public BalancedBinTree(long id) {
		super(id);
	}

}
