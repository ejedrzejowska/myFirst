package homework;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private Author author;
    private Cover cover;

    public Book(String title, Author author, Cover cover) {
        this.title = title;
        this.author = author;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                cover == book.cover;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, cover);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Książka{tytuł='");
        str.append(getTitle()).append("', okładka: ").append(cover.getType()).append("}");
        return str.toString();
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.getTitle());
    }
}
