import java.util.Scanner;

//Sick. Egit is working

public class Main {
	public static void main(String[] args) {
		hashMap hm = new hashMap();
	}
}

class Node {
	int key;
	int value;
	Node left;
	Node right;

	Node() {
	}

	Node(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}
}

class hashTree {
	Node root;

	hashTree() {
		root = null;
	}

	public void insert(Node n) {
		if (root == null) {
			root = n;
		} else {
			Node current = root;
			Node parent = null;
			while (1 == 1) {
				parent = current;
				if (n.key < current.key) {
					current = current.left;

					if (current == null) {
						parent.left = n;
						return;
					}
				} else {

					current = current.right;
					if (current == null) {
						parent.right = n;
						return;
					}
				}
			}
		}
	}

	public void search() {

	}

	public void print(Node root) {
		if (root != null) {
			print(root.left);
			System.out.print(root.value);
			print(root.right);
		}
	}
}

class hashMap {
	int tableSize;
	int itemNum;
	hashTree[] table;
	Node[] nodes = { new Node(1, 1), new Node(2, 2), new Node(3, 3), new Node(4, 4) };

	hashMap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of hash table: ");
		tableSize = in.nextInt();
		System.out.println("Enter initial number of items: ");
		itemNum = in.nextInt();
		in.close();
		table = new hashTree[tableSize]; // Creates array of trees
		for (int i = 0; i < tableSize; i++) // Initializes trees in array
		{
			table[i] = new hashTree();
		}
		for (int i = 0; i < 4; i++) {
			table[0].insert(nodes[i]);
		}
		table[0].print(table[0].root);
	}

	void insert(int key) {

	}

	/**
	 * Search function finds hashTree that contains the key, searches the tree
	 * for the key, then returns it.
	 * 
	 * @param key
	 *            : value you are searching for
	 */
	void search(int key) {

	}

}
