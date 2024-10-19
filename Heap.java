package heap_example;

public class Heap 
{
	void heap_sort(int a[])
	{
	int i ,j,current;
	boolean done;
	for(i=a.length-1;i>0;i--)//everytime one element is reduced
	{
	for(j=0;j<=i;j++)//current will go j to till zero
	{
	    current=j;
	    done=true;
	     while(current>0 && current/2>=0 && done==true)
	    {
	      if(current/2<current)//parent<child
	      {
	         int temp=a[current/2];
	          a[current/2]=a[current];
	          a[current]=temp;
	         current=current/2;//move to parent
	       }
	      else
	     done=false;
	}//while
  }//for j
	 //swap 0th with ith
	   int temp=a[0];
	   a[0]=a[i];
	   a[i]=temp;
	}//for i
   }//code
}


//private static final int SIZE = 10;
//private Integer[] keys;
//private String[] values;
//
//public HashTable() {
//    keys = new Integer[SIZE];
//    values = new String[SIZE];
//}
//
//private int hash(int key) {
//    return key % SIZE;
//}
//
//public void insert(int key, String value) {
//    int index = hash(key);
//
//    while (keys[index] != null) {
//        if (keys[index].equals(key)) { // Update if key already exists
//            values[index] = value;
//            return;
//        }
//        index = (index + 1) % SIZE; // Linear probing
//    }
//
//    keys[index] = key;
//    values[index] = value;
//}
//
//public String retrieve(int key) {
//    int index = hash(key);
//
//    while (keys[index] != null) {
//        if (keys[index].equals(key)) {
//            return values[index]; // Return the associated value
//        }
//        index = (index + 1) % SIZE; // Linear probing
//    }
//
//    return null; // Key not found
//}
//
//@Override
//public String toString() {
//     public static void main(String[args])
//}
//
//public static void main(String[] args) {
//    HashTable hashTable = new HashTable();
//    hashTable.insert(1, "one");
//    hashTable.insert(2, "two");
//    hashTable.insert(12, "twelve"); // Collision with key 2
//    hashTable.insert(3, "three");
//
//    System.out.println(hashTable.retrieve(1)); // Output: one
//    System.out.println(hashTable.retrieve(2)); // Output: two
//    System.out.println(hashTable.retrieve(12)); // Output: twelve
//    System.out.println(hashTable.retrieve(3)); // Output: three
//    System.out.println(hashTable.retrieve(4)); // Output: null (not found)
//
//    System.out.println(hashTable); // Output: current state of the hash table
//}
