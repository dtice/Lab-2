import java.util.Random;
import java.util.Scanner;

//Sick. Egit is working

public class Main {
	public static void main(String[] args) {
		int itemNum;
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		hashMap hm = new hashMap();
		System.out.println("Enter initial number of items: ");
		itemNum = in.nextInt();
		for (int i = 0; i < itemNum; i++)
		{
			hm.insert(rand.nextInt(1000));
		}
		hm.show();
		while(true)
		{
			System.out.println("Enter a value to search for: ");
			hm.search(in.nextInt());
		}
	}
}

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

	public void search(int key) {
        Node x = root;
        while (x != null) {
            if(x.getKey() < key) 
            	{
            		x = x.left;
            	}
            else if (x.getKey() > key){
            	x = x.right;
            }
            else System.out.println("Found: " + key);
            return;
        }
        System.out.println("Did not find: " + key);
        return;
    }

	public void print(Node root) {
		if (root != null) {
			print(root.left);
			System.out.print(root.key + " ");
			print(root.right);
		}
	}
}

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
	
	void show()
	{
		for(int i = 0; i < tableSize; i++)
		{
			System.out.print(i + ": ");
			table[i].print(table[i].root);
			System.out.println();
		}
	}

	void insert(int key) {
		table[key % tableSize].insert(new Node(key));
	}

	/**
	 * Search function finds hashTree that contains the key, searches the tree
	 * for the key, then returns it.
	 * 
	 * @param key
	 *            : value you are searching for
	 */
	void search(int key) {
		table[key % tableSize].search(key);
	}

}
