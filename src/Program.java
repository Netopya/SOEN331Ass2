/**
 * SOEN 331 Assignment 2
 * 
 * @author Michael Bilinsky 26992358
 * @author David Bastien 26948553
 */

public class Program {

	public static void main(String[] args) {

		//BINARY TREE
		System.out.println("\nBINARY TREE\n-----------------------------------------");
		BinTree tree1 = new BinTree(1);
		BinTree tree2 = new BinTree(2);
		BinTree tree3 = new BinTree(3);
		BinTree tree4 = new BinTree(4);
		BinTree tree5 = new BinTree(5);
		BinTree tree6 = new BinTree(6);
		BinTree tree7 = null;
		
		
		tree1.setLeft(tree2);
		tree1.setRight(tree3);
		tree2.setLeft(tree4);
		tree2.setRight(tree5);
		//tree1.setLeft(tree6); //FAIL NOT OVERWRITING A NODE
		//tree3.setLeft(tree7); //FAIL NULL PARAMETER REQUIREMENT
		
		System.out.println("Binary Tree height: " + tree1.height());
		System.out.println("Binary Tree sum of Nodes: " + tree1.sumNodes());
		
		
		
		
		//BALANCED BINARY TREE
		System.out.println("\nBALANCED BINARY TREE\n-----------------------------------------");
		BalancedBinTree balancedTree1 = new BalancedBinTree(1);
		BalancedBinTree balancedTree2 = new BalancedBinTree(2);
		BalancedBinTree balancedTree3 = new BalancedBinTree(3);
		BalancedBinTree balancedTree4 = new BalancedBinTree(4);
		BalancedBinTree balancedTree5 = new BalancedBinTree(5);
		BalancedBinTree balancedTree6 = new BalancedBinTree(6);
		BalancedBinTree balancedTree7 = new BalancedBinTree(7);
		
		balancedTree1.setLeft(balancedTree2);
		balancedTree1.setRight(balancedTree3);
		balancedTree2.setLeft(balancedTree4);
		balancedTree2.setRight(balancedTree5);
		
		//balancedTree5.setLeft(balancedTree6); //FAIL BALANCED INVARIANCE
		
		System.out.println("Balanced Binary Tree is balanced: " + balancedTree1.isBalanced());
		System.out.println("Balanced Binary Tree height: " + balancedTree1.height());
		System.out.println("Balanced Binary Tree sum of Nodes: " + balancedTree1.sumNodes());
		
		
		
		
		//FULL BINARY TREE
		System.out.println("\nFULL BINARY TREE\n-----------------------------------------");
		FullBinaryTree fulltree1 = new FullBinaryTree(1);
		FullBinaryTree fulltree2 = new FullBinaryTree(2);
		FullBinaryTree fulltree3 = new FullBinaryTree(3);
		FullBinaryTree fulltree4 = new FullBinaryTree(4);
		
		fulltree1.setLeftRight(fulltree2,fulltree3);
		//fulltree2.setLeft(fulltree4); //FAIL THE FULL INVARIANCE
		
		System.out.println("Is two or no leaf: " + fulltree1.isTwoOrNoLeaf());
		System.out.println("Full Binary Tree height: " + fulltree1.height());
		System.out.println("Full Binary Tree sum of Nodes: " + fulltree1.sumNodes());
		
		
		
		
		//PERFECT BINARY TREE
		System.out.println("\nPERFECT BINARY TREE\n-----------------------------------------");
		PerfectBinaryTree perfectTree1 = new PerfectBinaryTree(1);
		PerfectBinaryTree perfectTree2 = new PerfectBinaryTree(2);
		PerfectBinaryTree perfectTree3 = new PerfectBinaryTree(3);
		PerfectBinaryTree perfectTree4 = new PerfectBinaryTree(4);
		PerfectBinaryTree perfectTree5 = new PerfectBinaryTree(5);
		PerfectBinaryTree perfectTree6 = new PerfectBinaryTree(6);
		PerfectBinaryTree perfectTree7 = new PerfectBinaryTree(7);
		
		perfectTree1.setLeftRight(perfectTree2, perfectTree3);
		
		//perfectTree2.setLeftRight(perfectTree4, perfectTree5); //FAIL THE SAME HEIGHT INVARIANCE
		
		System.out.println("Same height: " + perfectTree1.sameHeight());
		System.out.println("Perfect Binary Tree height: " + perfectTree1.height());
		System.out.println("Perfect Binary Tree sum of Nodes: " + perfectTree1.sumNodes());
		
	}

}
