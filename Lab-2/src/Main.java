import java.util.Scanner;

//Why does everything related to Git suck SO MUCH COCK?!?!?!

public class Main 
{
	public static void main(String[] args)
	{
		hashMap hm = new hashMap();
	}
}

class Node
{
	int key;
	int value;
	Node left;
	Node right;
	
	Node()
	{}
	
	Node(int key, int value)
	{
		this.key = key;
		this.value = value;
	}
	
	public int getKey()
	{
		return key;
	}
	
	public int getValue()
	{
		return value;
	}
}

class hashTree
{
	Node root;
	hashTree()
	{
		root = new Node();
	}
	
	public void search()
	{
		
	}
	
	public void print()
	{
		
	}
}

class hashMap
{
	int tableSize;
	int itemNum;
	hashTree[] table;
	
	hashMap()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of hash table: ");
		tableSize = in.nextInt();
		System.out.println("Enter initial number of items: ");
		itemNum = in.nextInt();
		in.close();
		table = new hashTree[tableSize];
		for(int i = 0; i < tableSize; i++)
		{
			table[i] = new hashTree();
		}
	}
	
	void insert(int key)
	{
		
	}
	
	/**
	 * Search function finds hashTree that contains the key, searches the tree for the key, 
	 * then returns it.
	 * @param key : value you are searching for
	 */
	void search(int key)
	{
		
	}
	
	
}

