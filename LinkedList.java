class LinkedList {
    Node head; // Reference to the first node in the linked list

    // Method to add a book to the beginning of the list
    public void addFirst(Book book) {
        Node newNode = new Node(book);
        newNode.next = head;
        head = newNode;
    }

    // Method to add a book to the end of the list
    public void addLast(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to remove a book from the beginning of the list
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to remove a book from the end of the list
    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Method to print the list of books in reverse order
    public void printReverse() {
        printReverseHelper(head);
    }

    // Helper method for printing the list of books in reverse using recursion
    private void printReverseHelper(Node node) {
        if (node == null) {
            return;
        }

        printReverseHelper(node.next);

        Book book = node.data;
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Publication Year: " + book.publicationYear);
        System.out.println("----------------------");
    }
}
