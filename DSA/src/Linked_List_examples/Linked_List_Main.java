package Linked_List_examples;

import java.util.Scanner;

public class Linked_List_Main
{
    public static void main(String args[]) {
        Linked_List_Class obj = new Linked_List_Class();
        Scanner in = new Scanner(System.in);
        int ch, e = 0;
        obj.create_list();//creating LinkedList
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Search element in List\n7.Delete element\n8.Insert after\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_left(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                    break;
                case 6:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.search_list(e);
                    break;
                case 7:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.delete_left();
                    break;
                case 8:
                    System.out.println("Enter element to insert after:");
                    e = in.nextInt();
                    System.out.println("Enter element to search:");
                    int key = in.nextInt();
                    obj.insert_after(key,e);
                    System.out.println("Element Inserted");
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        } while (ch != 0);
    }
}