package Excercise6;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "The Alchemist", "Paulo Coelho"),
            new Book("B002", "Atomic Habits", "James Clear"),
            new Book("B003", "Clean Code", "Robert Martin"),
            new Book("B004", "1984", "George Orwell")
        };

        System.out.println("Linear Search for 'Clean Code':");
        Book found = SearchUtils.linearSearchByTitle(books, "Clean Code");
        System.out.println(found != null ? found : "Book not found");

        SearchUtils.sortBooksByTitle(books);

        System.out.println("\nBinary Search for 'Atomic Habits':");
        Book foundBinary = SearchUtils.binarySearchByTitle(books, "Atomic Habits");
        System.out.println(foundBinary != null ? foundBinary : "Book not found");
    }
}

