class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
             this.data = data;
	     this.prev = null;
	     this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                }

                System.out.println("Node with data " + data + " deleted.");
                return;
            }
            current = current.next;
        }

        System.out.println("Node with data " + data + " not found.");
    }
    public void display() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList ob = new DoublyLinkedList();

        ob.insertAtBeginning(2);
        ob.insertAtBeginning(1);
        ob.display();

        ob.insertAtEnd(3);
        ob.insertAtEnd(4);
        ob.display();

        ob.delete(2);
        ob.display();
    }
}
