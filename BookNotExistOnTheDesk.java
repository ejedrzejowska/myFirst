package homework;

public class BookNotExistOnTheDesk extends Exception {
    BookNotExistOnTheDesk(String s){
        super(s);
    }
}
