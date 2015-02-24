import be.ac.ua.ansymo.adbc.annotations.*;

@invariant({"$this.isTwoOrNoLeaf()"})
public class FullBinaryTree extends BinTree{

	public FullBinaryTree(long id) {
		super(id);
	}

}
