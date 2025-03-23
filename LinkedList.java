// LinkedList.java
public class LinkedList {
    // Node class to represent each element in the list
    private static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update the head to the new node
        System.out.println("Inserted " + data + " at the beginning.");
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) { // If the list is empty
            head = newNode; // Make the new node the head
        } else {
            Node temp = head; // Start from the head
            while (temp.next != null) { // Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode; // Point the last node to the new node
        }
        System.out.println("Inserted " + data + " at the end.");
    }

    // Method to delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty. Nothing to delete.");
        } else {
            System.out.println("Deleted " + head.data + " from the beginning.");
            head = head.next; // Update the head to the next node
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
        } else {
            Node temp = head; // Start from the head
            while (temp != null) { // Traverse the list
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null"); // End of the list
        }
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Test insertions
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);

        // Display the list
        list.display();

        // Test deletion
        list.deleteFromBeginning();
        list.display();
    }
}