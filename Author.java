package homework;

import java.util.Set;
import java.util.TreeSet;

public class Author {
    private String name;
    private String lastName;
    private Set<Book> bookSet = new TreeSet<>();

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void addBook(Book book){
        bookSet.add(book);
    }

    public Set<Book> getBookSet(){
        return bookSet;
    }
}
