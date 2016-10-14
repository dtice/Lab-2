import java.util.Random;
import java.util.Scanner;

/**
 * @author DillT
 * 
 *	A method for handling hash table collisions using tree data structures (separate chaining)
 *	Classes include: Node, HashTree, and HashMap
 *	------------------------------------------------------------------------------------------
 *	Main method includes options for showing the hash table, inserting new entries into the 
 *	hash table, and searching for an existing entry. Hash table is initialized in main with
 *	numbers.
 */

public class Main {
	public static void main(String[] args) {
		int itemNum;
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		hashMap hm = new hashMap();
		System.out.println("Enter initial number of items: ");
		itemNum = in.nextInt();
		for (int i = 0; i < itemNum; i++) {
			hm.insert(rand.nextInt(1000));
		}
		while (1 == 1) {
			System.out.println();
			System.out.println("Make a selection:\n0: Exit\n1: Show\n2: Search\n3: Insert");
			int menuNum = in.nextInt();
			switch (menuNum) {
			case 0: //Exits the program
				System.exit(0);
				break;
			case 1:	//Shows the hash table
				hm.show();
				break;
			case 2:	//Searches the hash table
				System.out.println("Enter a value to search for: ");
				int find = in.nextInt();
				if (hm.search(find)) {
					System.out.println("Found: " + find);
				} else {
					System.out.println("Couldn't find: " + find);
				}
				break;
			case 3:	//Inserts into the hash table
				System.out.println("Enter a value to insert: ");
				int value = in.nextInt();
				if (hm.search(value) != true) {
					hm.insert(value);
				} else {
					System.out.println("Error: Value already exists.");
				}
				break;
			}
		}
	}
}

/**
 * 
 * @author DillT
 *	Node class, holds entry information
 *	and pointers to left and right children
 */
class Node {
	int key;
	Node left;
	Node right;

	Node() {
	}

	Node(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}
}

/**
 * 
 * @author DillT
 *	Creates a basic binary search tree that holds nodes.
 *	Has search, insert, and show methods.
 */

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

	public boolean search(int key) {
		boolean found = false;
		Node current = root;
		while (current != null) {
			if (current.getKey() == key) {
				found = true;
				return found;
			} else if (current.getKey() > key) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return found;
	}

	public void print(Node root) {
		if (root != null) {
			print(root.left);
			System.out.print(root.key + " ");
			print(root.right);
		}
	}
}
/**
 * @author DillT
 *	HashMap class creates an array of HashTrees and organizes entries
 *	according to hash function in insert method.
 */
class hashMap {
	int tableSize;
	hashTree[] table;

	hashMap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of hash table: ");
		tableSize = in.nextInt();
		table = new hashTree[tableSize]; // Creates array of trees
		for (int i = 0; i < tableSize; i++) // Initializes trees in array
		{
			table[i] = new hashTree();
		}
	}

	void show() {
		for (int i = 0; i < tableSize; i++) {
			System.out.print(i + ": ");
			table[i].print(table[i].root);
			System.out.println();
		}
	}

	void insert(int key) {
		table[key % tableSize].insert(new Node(key));
	}

	/**
	 * @param key
	 * Search function finds hashTree that contains the key, searches the tree
	 * for the key, then returns it.
	 */
	boolean search(int key) {
		boolean found = false;
		if (table[key % tableSize].search(key)) {
			found = true;
			return found;
		} else {
			return found;
		}
	}

}
