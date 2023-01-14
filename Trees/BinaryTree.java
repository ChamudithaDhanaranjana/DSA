class BinaryTree
{
	Node root;
	class Node
	{
		int value;
		Node LeftChild;
		Node RightChild;
		
		Node(int value)
		{
			this.value = value;
		}
	}
	
		
	void preorder(Node node)
	{
		if (node != null)
		{
			System.out.print(node.value);
			preorder(node.LeftChild);
			preorder(node.RightChild);
		}
	}
	
	
	void inorder(Node node)
	{
		if (node != null)
		{
			inorder(node.LeftChild);
			System.out.print(node.value);
			inorder(node.RightChild);
		}
	}
	
	void postorder(Node node)
	{
		if (node != null)
		{
			postorder(node.LeftChild);
			postorder(node.RightChild);
			System.out.print(node.value);
		}
	}
	
	void print1(Node node)
	{
		System.out.print("Pre-order'\t'");
		preorder(node);
		System.out.print("'\n'");
	}
	
	void print2(Node node)
	{
		System.out.print("Post-order'\t'");
		postorder(node);
		System.out.print("'\n'");
	}
	
	public Node insert(Node node, int value)
	{
		if(node == null)
		{
			return new Node(value);
		}
		
		if(value < node.value)
		{
			node.LeftChild = insert(node.LeftChild, value);
		}
		else if(value > node.value)
		{
			node.RightChild = insert(node.RightChild, value);
		}
		
		return node;
	}	
	
	
	
	public static void main(String arr[])
	{
		BinaryTree bst = new BinaryTree();
		Node root = bst.root;
		root = bst.insert(bst.root, 5);
		root = bst.insert(root, 10);
		root = bst.insert(root, 8);
		root = bst.insert(root, 4);
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		bst.print1(root);
	}
	


	
}
