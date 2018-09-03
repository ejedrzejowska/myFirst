package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desk {
    private static List<Book> bookList = new ArrayList<>();

    public Desk() {
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public String getBooks() {
        StringBuilder str = new StringBuilder("");
        Collections.sort(bookList);         //alternatywnie można stworzyć kopie bookList, żeby nie sortować oryginalnych danych
        for (Book book : bookList) {
            str.append(book).append("\n");
        }
        return str.toString();
    }

    public void removeBook(Book book) throws BookNotExistOnTheDesk {
        if (!bookList.contains(book))
            throw new BookNotExistOnTheDesk("Nie można usunąć ksiązki - brak pozycji w rejestrze: " + book.getTitle());
        else {
            bookList.remove(book);
        }

    }
}
