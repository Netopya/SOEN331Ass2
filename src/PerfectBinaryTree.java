import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant({"$this.sameHeight()"})
public class PerfectBinaryTree extends FullBinaryTree{

	public PerfectBinaryTree(long id) {
		super(id);
	}
	
	public boolean sameHeight(){
		
		if(hasLeft() && hasRight())
			if(left.height() == right.height())
				return true;
			else
				return false;
		else if(!hasLeft() && !hasRight())
			return true;
		else
			return false;
	}

}
