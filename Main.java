public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList bookList = new LinkedList();

        // Add books to the list
        bookList.addFirst(new Book("Shadows of the Past", "Thomas Rivers", 2000));
        bookList.addLast(new Book("A Dance with Destiny", "Victoria Wilde", 2010));
	bookList.addLast(new Book("Secrets of the Silvermoon", "Silas Hawthorne", 2005));
	bookList.addLast(new Book("Echoes of the Spring", "Amelia Westwood", 2012));
        bookList.addLast(new Book("Whispers in the Wind", "Oliver Knight", 2020));

        // Display the list of books
        System.out.println("Books in reverse order:");
        bookList.printReverse();

        // Remove a book from the beginning
        bookList.removeFirst();

        // Remove a book from the end
        bookList.removeLast();

        // Display the updated list of books
        System.out.println("\nBooks after removing first and last:");
        bookList.printReverse();
    }
}
