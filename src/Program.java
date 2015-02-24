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
		BalancedBinTree balancedTree1 = new BalancedBinTree(1);
		BalancedBinTree balancedTree2 = new BalancedBinTree(2);
		BalancedBinTree balancedTree3 = new BalancedBinTree(3);
		BalancedBinTree balancedTree4 = new BalancedBinTree(4);
		
		balancedTree1.setLeft(balancedTree2);
		balancedTree1.setRight(balancedTree4);
		balancedTree2.setLeft(balancedTree3);
		
		System.out.println("Balanced Binary Tree is balanced: " + balancedTree1.isBalanced());
		System.out.println("Balanced Binary Tree height: " + balancedTree1.height());
		System.out.println("Balanced Binary Tree sum of Nodes: " + balancedTree1.sumNodes());
		
		//fail the invariance
		BalancedBinTree balancedTree5 = new BalancedBinTree(3);
		BalancedBinTree balancedTree6 = new BalancedBinTree(4);
		BalancedBinTree balancedTree7 = new BalancedBinTree(4);
		balancedTree3.setLeft(balancedTree5);
		balancedTree5.setLeft(balancedTree6);
		//balancedTree1.isBalanced();
		
		//FULL BINARY TREE
		FullBinaryTree fulltree1 = new FullBinaryTree(1);
		FullBinaryTree fulltree2 = new FullBinaryTree(2);
		FullBinaryTree fulltree3 = new FullBinaryTree(3);
		FullBinaryTree fulltree4 = new FullBinaryTree(4);
		
		fulltree1.setLeftRight(fulltree2,fulltree3);
		System.out.println("Is two or no leaf: " + fulltree1.isTwoOrNoLeaf());
		
		//fail the invariance
		//fulltree2.setLeft(fulltree4);
		
	}

}
