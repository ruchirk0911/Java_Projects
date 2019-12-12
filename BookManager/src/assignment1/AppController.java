
package assignment1;
import java.util.List;
public class AppController {
    public List<Book> getBookAC(String n){
        DBMgr dm = new DBMgr();
        List<Book>b= dm.getBookDM(n);
        return b;
    }
    public void addBookAC(Book b){
        DBMgr dm0 = new DBMgr();
        dm0.addBookDM(b);
    }
    public void updateBookAC(Book b1){
        DBMgr dm1 = new DBMgr();
        dm1.updateBookDM(b1);
    }
    
    public void undoUpdate(Book b){
       DBMgr dm1 = new DBMgr();
       dm1.undoUpdate(b);
    }
    
    public void deleteBookAC(String n){
        DBMgr dm2 = new DBMgr();
        dm2.deleteBookDM(n);
    }
    public List<Book> retrieveAllAC(){
        DBMgr dm3 = new DBMgr();
        List<Book>b1= dm3.retrieveAllDM();
        return b1;
    }
}
