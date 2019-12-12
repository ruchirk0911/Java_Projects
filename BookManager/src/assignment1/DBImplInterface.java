package assignment1;

import java.util.List;

public interface DBImplInterface {
    public List<Book> getBook(String n);
    public void addTextBook(Book b);
    public void addJournal(Book b);
    public void updateTextBook(Book b1);
    public void updateJournal(Book b1);
    public void undoUpdate(Book b1);
    public void redoUpdate(Book b1);
    public void deleteBook(String name);
    public List<Book> retrieveAll();
}
