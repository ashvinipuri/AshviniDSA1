//Implement a hash table using linear probing with a table size of 10 and a hash function of x % 10 for indexing. 
//The hash table should efficiently store and retrieve key-value pairs.


package hash;

public class HashTable 
{
  int size=10;
  Integer[] keys ;
 String[] values;
 
 
 public HashTable()
 {
	 keys=new Integer[size];
	 values=new String[size];
 }
 private int hash(int key)
 {
	 return key%size;
 }
 
 public void insert(int key,String value)
 {
	 int index=hash(key);
	 while (keys[index] != null) 
	 {
     if (keys[index].equals(key))
     { // Update if key already exists
    	 values[index]=value;
    	 return;
     }
     index=(index+1)%size; // linear probing
 }
	 keys [index]=key;
	 values [index]=value;
 }
 public String retrive(int key)
 {
	 int index = hash(key);
	 
	     while (keys[index] != null)
	     {
	         if (keys[index].equals(key)) 
	         {
	             return values[index]; // Return the associated value
	         }
	         index = (index + 1) % size; // Linear probing
	     }
	       return ("not found in hashtable") ; // key not found in hashtable
 }
@Override
public String toString() {
	  StringBuilder sb = new StringBuilder();
      for (int i = 0; i <size; i++) {
          if (keys[i] != null) {
              sb.append("(").append(keys[i]).append(", ").append(values[i]).append(") ");
          }
      }
      return sb.toString();
  }

public static void main(String[]args)
{
	HashTable ht=new HashTable();
	ht.insert(1, "one");
	ht.insert(4, "Two");
	ht.insert(9, "Nine");
	ht.insert(4, "Four");
	//ht.insert(18,"Eighteen");
	
	System.out.println(ht.retrive(1));
	System.out.println(ht.retrive(4));
	System.out.println(ht.retrive(9));
	System.out.println(ht.retrive(4));
	System.out.println(ht.retrive(18));
	
	System.out.println(ht);
}
}