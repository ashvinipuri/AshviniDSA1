package Tree_Examples;

public class Search_Tree 
{
	private Node root;

	   void create_Tree()
	   {
	       root=null;
	   }
	   void insert(Node r,Node n)//in bst manner
	           //r is root , n is new node
	   {
	       if(root==null)
	           root=n;
	       else
	       {
	           if(n.data<r.data)//if less to left
	           {
	               if(r.left==null)//empty left
	               {
	                   r.left = n;
	                   System.out.println(n.data + " inserted");
	               }
	               else
	                   insert(r.left,n);//recursion call
	           }
	           else//if equal or greater than to right
	           {
	               if(r.right==null)//empty left
	               {
	                   r.right = n;
	                   System.out.println(n.data + " inserted");
	               }
	               else
	                   insert(r.right,n);//recursion call

	           }

	       }

	   }
	 
	   boolean search(int key)
	   {
	       if(root==null) {
	           System.out.println("Empty Tree");

	           return false;
	       }
	       else
	       {
	           Node r=root;
	          while(r!=null) {
	              if (key == r.data)
	                  return true;
	              else {
	                  if (key < r.data)
	                      r = r.left;
	                  else
	                      r = r.right;
	              }
	          }
	       return false;

	       }

	   }
	    Node get_root()
	    {
	        return root;
	    }

	public static void main(String args[])
	{
	    Search_Tree obj=new Search_Tree();
	    obj.create_Tree();
	    Node x=new Node(10);
	    obj.insert(obj.get_root(),new Node(50));
	    obj.insert(obj.get_root(),new Node(30));
	    obj.insert(obj.get_root(),new Node(100));
	    obj.insert(obj.get_root(),new Node(5));
	    obj.insert(obj.get_root(),new Node(45));
	    obj.insert(obj.get_root(),new Node(200));
	   
	    System.out.println("\nElement 12 in tree:"+obj.search(12));
	    System.out.println("\nElement 200 in tree:"+obj.search(200));
	  //  System.out.println("\nDepth is:"+(obj.depth(obj.get_root())-1));
	}

	}
