package Excercise6;

public class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title.toLowerCase();
    }

    public String getAuthor() {
        return author.toLowerCase();
    }

    @Override
    public String toString() {
        return bookId + " | " + title + " | " + author;
    }
}

