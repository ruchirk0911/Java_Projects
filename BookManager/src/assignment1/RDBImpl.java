
package assignment1;

import java.util.List;

public class RDBImpl implements DBImplInterface{
    @Override
    public List<Book> getBook(String n){
        RDBImplCmd g = new GetBook(n);
        g.execute();
        List<Book> b= (List<Book>)g.getBookCmd();
        return b;
    }
    @Override
    public void addTextBook(Book b){
        RDBImplCmd g1 = new AddTextBook(b);
        g1.execute();
    }
    @Override
    public void updateTextBook(Book b1){
      RDBImplCmd g2 = new UpdateTextBook(b1);
        g2.execute();  
    }
    @Override
    public void deleteBook(String n){
        RDBImplCmd g3 = new DeleteBook(n);
        g3.execute();
    }
    public List<Book> retrieveAll(){
        RDBImplCmd g4 = new RetrieveAll();
        g4.execute();
        List<Book> b= (List<Book>)g4.getBookCmd();
        return b;
    }

    @Override
    public void addJournal(Book b) {
        RDBImplCmd g5 = new AddJournal(b);
        g5.execute();
    }

    @Override
    public void updateJournal(Book b1) {
        RDBImplCmd g6 = new UpdateJournal(b1);
        g6.execute();
    }

    @Override
    public void undoUpdate(Book b1) {
        UpdateJournal g7 = new UpdateJournal(b1);
        g7.undoUJ();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redoUpdate(Book b1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
