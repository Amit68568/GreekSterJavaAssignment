package Assignment(22-nov-2021);

public class SumOfAllNodes {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right= new Node(6);
		root.right.left.right.left= new Node(7);
		
		System.out.println(addNodes(root));
	}
	public static int addNodes(Node root) {
		if(root == null) return 0;
		
		int l = addNodes(root.left);
		int r = addNodes(root.right);
		
		return root.key+l+r;
	}
}