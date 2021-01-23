import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Execute {

	public static BinaryTree read(String filename) throws FileNotFoundException {
		
		ArrayStack<TreeNode> tn = new ArrayStack<TreeNode>();
		String element;
		double distance; 
		
		Scanner input = new Scanner(new File(filename));
		while(input.hasNext()) {
			char c = input.next().charAt(0);
			if(c == '(') {
			} else if (c == ')') {
				TreeNode rightChild = tn.pop();
				TreeNode leftChild = tn.pop();
				TreeNode parent = tn.pop();
				parent.left = leftChild;
				parent.right = rightChild;
				tn.push(parent);
			} else {
				element = Character.toString(c);
				distance = Double.valueOf(input.next());
				TreeNode<String> newNode = new TreeNode<String>(element, distance);
				tn.push(newNode);
			}
		}
		BinaryTree bt = new BinaryTree(tn.pop());
		return bt;
	}

	
	public static void main(String[] args) throws FileNotFoundException {
		BinaryTree bt = read(args[0]);
		double output = bt.breadthFirstSearch("*");
		System.out.println(output);
		
	}

}
