package assignments;

import java.util.Scanner;


public class Eliminate_Duplicates {

	static class LinkedList {
		Node head; // head of list
		Node tail;
		int size;
		/* Linked list Node */
		class Node {
			int data;
			Node next;

			Node(int d) {
				data = d;
				next = null;
			}

			public Node() {
				// TODO Auto-generated constructor stub
			}
		}

		void removeDuplicates() {
			/* Another reference to head */
			Node current = head;

			/* Pointer to store the next pointer of a node to be deleted */
			Node next_next;

			/* do nothing if the list is empty */
			if (head == null)
				return;

			/* Traverse list till the last node */
			while (current.next != null) {

				/* Compare current node with the next node */
				if (current.data == current.next.data) {
					next_next = current.next.next;
					current.next = null;
					current.next = next_next;
				} else // advance if no deletion
					current = current.next;
			}
		}

		/* Utility functions */

		/* Inserts a new Node at front of the list. */
		public void addLast(int item) {

			// 1. new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// 2. attach
			if (this.size > 0)
				this.tail.next = nn;

			// 3. summary update
			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
				this.size++;
			} else {
				this.tail = nn;
				this.size++;
			}
		}

		/* Function to print linked list */
		void printList() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		/* Drier program to test above functions */
		public static void main(String args[]) {

			Scanner scn = new Scanner(System.in);
			LinkedList llist = new LinkedList();

			int n = scn.nextInt();

			for (int i = 0; i < n; i++) {
				int x = scn.nextInt();
				llist.addLast(x);

			}

			System.out.println("List before removal of duplicates");
			llist.printList();

			llist.removeDuplicates();

			System.out.println("List after removal of elements");
			llist.printList();
		}
	}
}