

public class TreeNode<E>  implements Comparable {
		
		E element;
		double distance;
		public TreeNode left;
		public TreeNode right; 
		
		public TreeNode (E e, double d)
		{
			this (e, d, null, null);
		}
		
		public TreeNode (E e, double d, TreeNode l, TreeNode r)
		{
			element = e;
			left = l;
			right = r;
			distance = (double) d; // initially hold the distance the node is from its parent
		}

		public String toString()
		{
			return "" + element;
		}

		@Override
		public int compareTo(Object o) {
			TreeNode t = (TreeNode) o;
			if(this.distance<t.distance) {
				return -1;
			} else if (this.distance==t.distance) {
				return 0;
			} else if (this.distance>t.distance) {
				return 1;
			} else {
				return (Integer) null;
			}
		}			
		
	}