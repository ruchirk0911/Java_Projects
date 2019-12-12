package assignment1;

import java.util.List;

public class DBMgr {
    public List getBookDM(String n){
        DBImplInterface dbi = new RDBImpl();
        List<Book> b = dbi.getBook(n);
        return b;
    }
    public void addBookDM(Book b){
        DBImplInterface dbi = new RDBImpl();
        if(b.getType().equals("Text Book")){
           dbi.addTextBook(b); 
        }else if(b.getType().equals("Journal")){
           dbi.addJournal(b); 
        }
        
    }
    public void updateBookDM(Book b1){
        DBImplInterface dbi1 = new RDBImpl();
        if(b1.getType().equals("Book")){
           dbi1.updateTextBook(b1); 
        }else if(b1.getType().equals("Journal")){
           dbi1.updateJournal(b1);
        }
        
    }
    
    public void undoUpdate(Book b){
        DBImplInterface dbi1 = new RDBImpl();
        dbi1.undoUpdate(b);
    }
    
    public void deleteBookDM(String n){
        DBImplInterface dbi2 = new RDBImpl();
        dbi2.deleteBook(n);
    }
    public List retrieveAllDM(){
        DBImplInterface dbi = new RDBImpl();
        List<Book> b1 = dbi.retrieveAll();
        return b1;
    }
}
