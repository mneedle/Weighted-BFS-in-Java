public class BinaryTree {
	
	TreeNode root;
	
	public BinaryTree( TreeNode root )
	{
		this.root = root;
	}
	
	public double breadthFirstSearch( Object o ){
		BinaryHeap<TreeNode> bheap = new BinaryHeap<TreeNode>();
		bheap.insert(root);
		
		while(!bheap.isEmpty()) {
			TreeNode q = bheap.deleteMin();
			if(q!=null) {
				if(q.element.equals(o)) {
					return q.distance;
				} else {
					if(q.left!=null) {
						TreeNode leftChild = q.left;
						TreeNode rightChild = q.right;
						leftChild.distance += q.distance;
						rightChild.distance += q.distance;
						bheap.insert(leftChild);
						bheap.insert(rightChild);
					}
				}
			}
		}
		return (Double) null;
	}
}