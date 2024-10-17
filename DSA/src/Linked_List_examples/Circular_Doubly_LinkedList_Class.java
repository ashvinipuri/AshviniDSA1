package Linked_List_examples;

public class Circular_Doubly_LinkedList_Class
{

    private Node right;
    private Node left;
    Node root;
    public Circular_Doubly_LinkedList_Class()
    {
        right= null;
         left = null;
    }
    void create_list() 
    {
        root = null;//preparing with empty root
    }
    
    // Insert a new node at the end (rightmost) of the list
    public void insert_End(int data) 
    {
        Node newNode = new Node(data);
        if (right == null) 
        {
            right = newNode;
            left = newNode;
            right.next = right; // Points to itself
            right.prev = right; // Points to itself
        }
        else 
        {
            left.next = newNode;
            newNode.prev = left;
            newNode.next = right;
            right.prev = newNode;
            left = newNode;
        }
    }

    // Remove the leftmost node from the list
    public void remove_Front() 
    {
        if (right == null) return; // List is empty
        if (right == left)
        {
            right = null; // Only one node
            left = null;
        } else {
            right = right.next;
            left.next = right; // Update left's next to new right
            right.prev = left; // Update new right's previous to left
        }
    }

    // Remove the rightmost node from the list
    public void remove_End() 
    {
        if (left == null) return; // List is empty
        if (right == left) {
            right = null; // Only one node
            left = null;
        } else {
            left = left.prev;
            left.next = right; // Update new left's next to right
            right.prev = left; // Update right's previous to new left
        }
    }

    // Traverse the list from right to left
    public void traverseForward()
    {
        if (right == null) return;
        Node current = right;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != right);
        System.out.println();
    }

    // Traverse the list from left to right
    public void traverse_Backward() 
    {
        if (left == null) return;
        Node current = left;
        do {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        while (current != left);
        System.out.println();
    }
}
