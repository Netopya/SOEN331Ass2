public class Program {

	public static void main(String[] args) {

		//BINARY TREE
		BinTree tree1 = new BinTree(1);
		BinTree tree2 = new BinTree(3);
		
		tree1.setLeft(new BinTree(3));
		tree1.setRight(tree2);
		tree2.setLeft(new BinTree(4));
		tree2.setRight(new BinTree(5));
		
		System.out.println("Binary Tree height: " + tree1.height());
		System.out.println("Binary Tree sum of Nodes: " + tree1.sumNodes());
		
		//BALANCED BINARY TREE
		BinTree balancedTree1 = new BinTree(1);
		
		System.out.println("Binary Tree height: " + balancedTree1.height());
		System.out.println("Binary Tree sum of Nodes: " + balancedTree1.sumNodes());

	}

}
