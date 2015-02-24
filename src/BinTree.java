import be.ac.ua.ansymo.adbc.annotations.*;

@invariant("$this.height() != 0")
public class BinTree {

	protected long id;
	protected BinTree left, right;
	
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
	
	public boolean isBalanced(){
		int lh = 0, rh = 0;
		
		if(hasLeft())
			lh = left.height();
		
		if(hasRight())
			rh = right.height();
		
		if(Math.abs(lh - rh) <= 1)
			return true;
		
		return false;
	}
	
	public boolean isTwoOrNoLeaf(){
		if(hasLeft() && hasRight())
			return getLeft().isTwoOrNoLeaf() && getRight().isTwoOrNoLeaf();
		else if(!hasLeft() && !hasRight())
			return true;
		else
			return false;
	}
	
	@requires({"a != null","b != null","$this.left == null","$this.right == null"})
	@ensures({"$this.left != null","$this.right != null","$this.left == a","$this.right == b"})
	public void setLeftRight(BinTree a, BinTree b){
		this.left = a;
		this.right = b;
	}
	
}
