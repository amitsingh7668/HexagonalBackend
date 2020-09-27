package com.hackathon.socgen.unitTest;


class Node{
	 int key;
	 Node left;
	 Node right;
	 Node(int items)
	 {
		 this.key=items;
	 }
}
public class binaryTree {

	Node node;
	binaryTree(int items)
	{
		node= new Node(items);
	}
	
	void check(binaryTree n)
	{
		if(n.node.right != null)
		{
			System.out.println(n.node.right.key);
		}
		
	}
	public static void main(String[] args) {
		binaryTree bt = new binaryTree(10);
		bt.node.left= new Node(2);
		bt.node.right = new Node(3);
		bt.node.right.right = new Node(4);
		bt.node.right.right.right = new Node(5);
		System.out.println(bt.node.key);
		bt.check(bt);
	}
}
