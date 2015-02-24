import be.ac.ua.ansymo.adbc.annotations.*;

@invariant("$this.height() != 0")
public class BinTree {

	private long id;
	private BinTree left, right;
	
	@requires({"id != null"})
	public BinTree(long id){
		this.id = id;
	}
	
	public BinTree getLeft(){
		return this.left;
	}
	
	public BinTree getRight(){
		return this.right;
	}
	
	@requires({"iBinTree != null","$this.left == null"})
	@ensures({"$this.left != null","$this.left == iBinTree"})
	public void setLeft(BinTree iBinTree){
		this.left = iBinTree;
	}

	@requires({"iBinTree != null","$this.right == null"})
	@ensures({"$this.right != null","$this.right == iBinTree"})
	public void setRight(BinTree iBinTree){
		this.right = iBinTree;
	}
	
	public boolean hasLeft(){
		if(left != null)
			return true;
		else
			return false;
	}
	
	public boolean hasRight(){
		if(right != null)
			return true;
		else
			return false;
	}
	
	public int sumNodes(){
		int left = 0, right = 0;
		
		if(hasLeft())
			left = getLeft().sumNodes();
		
		if(hasRight())
			right = getRight().sumNodes();

		return 1 + left + right;
	}
	
	public int height(){
		int lh = 0, rh = 0;
		
		if(hasLeft())
			lh = getLeft().height();
		
		if(hasRight())
			rh = getRight().height();
		
		if(lh >= rh)
			return 1 + lh;
		else
			return 1 + rh;
			
	}
	
}
