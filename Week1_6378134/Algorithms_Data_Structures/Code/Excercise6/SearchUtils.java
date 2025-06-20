package Excercise6;

import java.util.Arrays;
import java.util.Comparator;

public class SearchUtils {

    public static Book linearSearchByTitle(Book[] books, String targetTitle) {
        targetTitle = targetTitle.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().equals(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle));
    }

    public static Book binarySearchByTitle(Book[] books, String targetTitle) {
        targetTitle = targetTitle.toLowerCase();
        int low = 0, high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = books[mid].getTitle().compareTo(targetTitle);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}

