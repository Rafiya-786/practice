package Day3;
class Node {
 int data;
 Node next;
 Node(int data) {
     this.data = data;
     this.next = null;
 }
}
class LinkedList {
 Node ROOT;
 public void add(int data) {
     Node newNode = new Node(data);
     if (ROOT == null) {
         ROOT = newNode;
     } else {
         Node temp = ROOT;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
     }
 }

 // Method to print the linked list
 public void printList() {
     Node temp = ROOT;
     while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }
     System.out.println();
 }

 public void bubbleSort() {
     if (ROOT == null || ROOT.next == null) {
         return;
     }

     boolean swapped;
     do {
         swapped = false;
         Node current = ROOT;
         Node prev = null;
         while (current != null && current.next != null) {
             if (current.data > current.next.data) {
                 int temp = current.data;
                 current.data = current.next.data;
                 current.next.data = temp;

                 swapped = true;
             }
             current = current.next;
         }
     } while (swapped);  
 }
}

public class Bubblesortlist {
 public static void main(String[] args) {
     LinkedList list = new LinkedList();
     list.add(5);
     list.add(3);
     list.add(8);
     list.add(1);
     list.add(7);

     System.out.println("Original Linked List:");
     list.printList();

     list.bubbleSort();

     System.out.println("Sorted Linked List:");
     list.printList();
 }
}
