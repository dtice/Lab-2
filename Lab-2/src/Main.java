import java.util.Scanner;

public class notMain 
{
	public static void main(String[] args)
	{
		
	}
}

class hashTree
{
	hashTree()
	{
		
	}
}

class hashMap
{
	int tableSize;
	int itemNum;
	hashTree[] table;
	
	hashMap(int tableSize)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of hash table: ");
		tableSize = in.nextInt();
		System.out.println("Enter initial number of items: ");
		itemNum = in.nextInt();
		in.close();
	}
	
	void insert(int key)
	{
		
	}
	
	void search(int key)
	{
		int hash = (key % tableSize);
	}
	
	
}

